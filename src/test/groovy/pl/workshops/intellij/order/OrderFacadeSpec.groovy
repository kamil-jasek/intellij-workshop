package pl.workshops.intellij.order


import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Import
import org.springframework.transaction.annotation.Transactional
import pl.workshops.intellij.order.infra.dto.ProductDto
import spock.lang.Specification

@SpringBootTest
@Import(OrderFacadeSpecConfig)
@Transactional
class OrderFacadeSpec extends Specification {

    @Autowired
    private OrderFacade facade

    @Autowired
    private CustomerRepository customerRepository

    @Autowired
    private EmailSender emailSender

    def 'should create order with single product'() {
        given:
        final def customer = new Customer("test@test.pl")
        customerRepository.save(customer)
        def products = List.of(
                new ProductDto("p1", new BigDecimal("10.00"), 1, 1.2)
        )

        when:
        def created = facade.createOrder(customer.id, products, "XYZ")

        then:
        created
        1 * emailSender.sendEmail(*_) >> true
    }

    def 'should create order with many products'() {
        given:
        final def customer = new Customer("test@test.pl")
        customerRepository.save(customer)
        def products = List.of(
                new ProductDto("p1", new BigDecimal("10.00"), 1, 1.2),
                new ProductDto("p2", new BigDecimal("20.00"), 2, 0.4)
        )

        when:
        def created = facade.createOrder(customer.id, products, "XYZ")

        then:
        created
        1 * emailSender.sendEmail(*_) >> true
    }
}
