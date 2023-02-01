package pl.workshops.intellij.order;

import pl.workshops.intellij.order.infra.dto.ProductDto;

import java.util.List;
import java.util.UUID;

public record CreateOrderCmd(UUID customerId, List<ProductDto> products, String coupon) {
    boolean hasProducts() {
        return products() == null || products()
                .size() == 0;
    }
}