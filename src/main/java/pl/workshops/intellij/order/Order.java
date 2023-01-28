package pl.workshops.intellij.order;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
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

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getCid() {
        return cid;
    }

    public void setCid(UUID cid) {
        this.cid = cid;
    }

    public LocalDateTime getCtime() {
        return ctime;
    }

    public void setCtime(LocalDateTime ctime) {
        this.ctime = ctime;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public BigDecimal getDeliveryCost() {
        return deliveryCost;
    }

    public void setDeliveryCost(BigDecimal deliveryCost) {
        this.deliveryCost = deliveryCost;
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