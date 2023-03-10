package pl.workshops.intellij.order;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "order_items")
class OrderItem {

    @Id
    private UUID id;
    private String name;
    private BigDecimal price;
    private int quantity;
    private Float weight;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderItem item = (OrderItem) o;
        return quantity == item.quantity && Objects.equals(id, item.id) && Objects
                .equals(name, item.name) && Objects.equals(price, item.price) && Objects
                .equals(weight, item.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, quantity, weight);
    }
}
