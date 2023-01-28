package pl.workshops.intellij.order.infra.http;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.workshops.intellij.order.OrderFacade;
import pl.workshops.intellij.order.infra.dto.CreateOrder;

import java.util.UUID;

@RestController
@RequestMapping("/api/orders")
final class WriteOrderRestController {

    private final OrderFacade facade;

    WriteOrderRestController(OrderFacade facade) {
        this.facade = facade;
    }

    @PostMapping
    ResponseEntity<Void> create(@RequestBody @Valid CreateOrder order) {
        var created = facade.createOrder(UUID.fromString(order.getCid()),
                order.getProducts(),
                order.getCoupon());
        if (created) {
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.badRequest().build();
    }
}