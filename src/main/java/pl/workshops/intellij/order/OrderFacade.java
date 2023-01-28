package pl.workshops.intellij.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.workshops.intellij.order.infra.dto.ProductDto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class OrderFacade {

    @Autowired
    private OrderRepository orderRepo;

    @Autowired
    private CustomerRepository customerRepo;

    @Autowired
    private CouponRepository couponRepo;

    @Autowired
    private EmailSender emailSender;

    public boolean createOrder(UUID cid, List<ProductDto> products, String coupon) {
        var result = false;
        var optional = customerRepo.findById(cid);
        if (optional.isPresent() && products != null && products.size() > 0) {
            var order = new Order();
            order.setId(genId());
            order.setCid(cid);
            order.setCtime(LocalDateTime.now());
            order.setStatus(Order.ORDER_STATUS_WAITING);
            var itemsList = new ArrayList<OrderItem>();
            itemsList.addAll(products.stream()
                    .map(pr -> toOrderItem(pr))
                    .toList());
            order.setItems(itemsList);

            // add discount
            final var optDiscCoupon = couponRepo.findById(coupon);
            if (optDiscCoupon.isPresent()) {
                var dc = optDiscCoupon.get();
                if (!dc.isUsed() && dc.getValidDate().isAfter(LocalDateTime.now())) {
                    order.setDiscount(dc.getDiscount());
                    dc.setUsedBy(cid);
                    dc.setUsed(true);
                    couponRepo.save(dc);
                }
            }

            // calculate delivery
            computeDelivery(order.getItems(), order);

            var cust = optional.get();

            // save to db and send email
            orderRepo.save(order);
            var sendEmail = emailSender.sendEmail(cust.getEmail(),
                    "Your order is placed!",
                    "Thanks for ordering our products. Your order will be send very soon!");
            result = sendEmail;
        }

        return result;
    }

    private OrderItem toOrderItem(ProductDto pr) {
        var item = new OrderItem();
        item.setId(genId());
        item.setName(pr.getName());
        item.setPrice(pr.getPrice());
        item.setQuantity(pr.getQuantity());
        item.setWeight(pr.getWeight());
        return item;
    }

    private void computeDelivery(List<OrderItem> items, Order order) {
        var tp = BigDecimal.ZERO;
        var tw = 0;
        for (OrderItem i : items) {
            tp = tp.add(i.getPrice()
                    .multiply(new BigDecimal(i.getQuantity()))); // tp = tp + (i.price * i.quantity)
            tw += (i.getQuantity() * i.getWeight());
        }
        if (tp.compareTo(new BigDecimal(250)) > 0 && tw < 1) {
            order.setDeliveryCost(BigDecimal.ZERO);
        } else if (tw < 1) {
            order.setDeliveryCost(new BigDecimal(15));
        } else if (tw < 5) {
            order.setDeliveryCost(new BigDecimal(35));
        } else {
            order.setDeliveryCost(new BigDecimal(50));
        }
    }

    private UUID genId() {
        return UUID.randomUUID();
    }
}