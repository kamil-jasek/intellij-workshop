package pl.workshops.intellij.order.infra.dto;

import java.util.List;

public class CreateOrder {

    private String cid;
    private List<ProductDto> products;
    private String coupon;

    public String getCid() {
        return cid;
    }

    public List<ProductDto> getProducts() {
        return products;
    }

    public String getCoupon() {
        return coupon;
    }
}
