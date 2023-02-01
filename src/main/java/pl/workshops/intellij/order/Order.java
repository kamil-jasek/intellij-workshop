package pl.workshops.intellij.order;

import jakarta.persistence.*;
import pl.workshops.intellij.order.infra.dto.ProductDto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "orders")
class Order {

    // order statuses
    public static final int ORDER_STATUS_WAITING = 1;
    public static final int ORDER_STATUS_SENT = 2;
    public static final int ORDER_STATUS_DELIVERED = 3;
    public static final BigDecimal FREE_DELIVERY = new BigDecimal(250);

    @Id
    private UUID id;

    // customer id
    private UUID cid;

    private LocalDateTime ctime;

    // value between 0 and 1
    private float discount;

    @OneToMany(cascade = CascadeType.ALL)
    private List<OrderItem> items;

    private int status;

    public BigDecimal deliveryCost;

    static Order mapFrom(CreateOrderCmd cmd) {
        var order = new Order();
        order.id = UUID.randomUUID();
        order.cid = cmd.customerId();
        order.ctime = LocalDateTime.now();
        order.status = ORDER_STATUS_WAITING;
        order.items = new ArrayList<>(cmd
                .products()
                .stream()
                .map(Order::toOrderItem)
                .toList());
        return order;
    }

    private static OrderItem toOrderItem(ProductDto pr) {
        var item = new OrderItem();
        item.setId(UUID.randomUUID());
        item.setName(pr.getName());
        item.setPrice(pr.getPrice());
        item.setQuantity(pr.getQuantity());
        item.setWeight(pr.getWeight());
        return item;
    }

    public UUID getId() {
        return id;
    }

    public UUID getCid() {
        return cid;
    }

    public LocalDateTime getCtime() {
        return ctime;
    }

    public float getDiscount() {
        return discount;
    }

    public void applyDiscount(float discount) {
        this.discount = discount;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public int getStatus() {
        return status;
    }

    public BigDecimal getDeliveryCost() {
        return deliveryCost;
    }

    public void setDeliveryCost(BigDecimal deliveryCost) {
        this.deliveryCost = deliveryCost;
    }

    void computeDelivery() {
        var totalPrice = BigDecimal.ZERO;
        var totalWeight = 0;
        for (OrderItem item : getItems()) {
            totalPrice = totalPrice.add(item.getPrice()
                    .multiply(new BigDecimal(item.getQuantity()))); // totalPrice = totalPrice + (item.price * item.quantity)
            totalWeight += (item.getQuantity() * item.getWeight());
        }
        if (totalPrice.compareTo(FREE_DELIVERY) > 0 && totalWeight < 1) {
            setDeliveryCost(BigDecimal.ZERO);
        } else if (totalWeight < 1) {
            setDeliveryCost(new BigDecimal(15));
        } else if (totalWeight < 5) {
            setDeliveryCost(new BigDecimal(35));
        } else {
            setDeliveryCost(new BigDecimal(50));
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order order)) return false;
        return id.equals(order.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}