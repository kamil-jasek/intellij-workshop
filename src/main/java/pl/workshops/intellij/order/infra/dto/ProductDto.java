package pl.workshops.intellij.order.infra.dto;

import java.math.BigDecimal;

public class ProductDto {

    private String name;
    private BigDecimal price;
    private int quantity;
    private Float weight;

    public ProductDto(String name, BigDecimal price, int quantity, Float weight) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public Float getWeight() {
        return weight;
    }
}
