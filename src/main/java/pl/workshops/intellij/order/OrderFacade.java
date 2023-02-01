package pl.workshops.intellij.order;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@Transactional
public class OrderFacade {

    private final OrderRepository orderRepo;
    private final CustomerRepository customerRepo;
    private final CouponRepository couponRepo;
    private final EmailSender emailSender;

    public OrderFacade(OrderRepository orderRepo,
                       CustomerRepository customerRepo,
                       CouponRepository couponRepo,
                       EmailSender emailSender) {
        this.orderRepo = orderRepo;
        this.customerRepo = customerRepo;
        this.couponRepo = couponRepo;
        this.emailSender = emailSender;
    }

    public boolean createOrder(CreateOrderCmd cmd) {
        var maybeCustomer = customerRepo.findById(cmd.customerId());
        if (maybeCustomer.isEmpty() || cmd.hasProducts()) {
            return false;
        }
        Order order = Order.mapFrom(cmd);
        applyDiscount(cmd, order);
        order.computeDelivery();
        orderRepo.save(order);
        return emailSender.sendEmail(maybeCustomer.get().getEmail(),
                "Your order is placed!",
                "Thanks for ordering our products. Your order will be send very soon!");
    }

    private void applyDiscount(CreateOrderCmd cmd, Order order) {
        couponRepo.findById(cmd.coupon())
                .ifPresent(discountCoupon -> applyDiscount(order, discountCoupon, cmd.customerId()));
    }

    private void applyDiscount(Order order, DiscountCoupon discountCoupon, UUID usedBy) {
        if (discountCoupon.isUsed() || !discountCoupon
                .getValidDate()
                .isAfter(LocalDateTime.now())) {
            return;
        }
        order.applyDiscount(discountCoupon.getDiscount());
        discountCoupon.setUsedBy(usedBy);
        discountCoupon.setUsed(true);
        couponRepo.save(discountCoupon);
    }
}