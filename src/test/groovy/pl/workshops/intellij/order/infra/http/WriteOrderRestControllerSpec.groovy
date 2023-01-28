package pl.workshops.intellij.order.infra.http

import org.spockframework.spring.SpringBean
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import pl.workshops.intellij.order.OrderFacade
import spock.lang.Specification

import static org.springframework.http.MediaType.APPLICATION_JSON
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post

@WebMvcTest(WriteOrderRestController)
class WriteOrderRestControllerSpec extends Specification {

    @SpringBean
    private OrderFacade orderFacade = Mock();

    @Autowired
    private MockMvc mvc;

    def 'POST /api/orders should return OK'() {
        when:
        def response = mvc.perform(post("/api/orders")
                .contentType(APPLICATION_JSON)
                .content("""
                  {
                    "cid": "31f9675f-a27d-40ad-bd56-c87ce575df62",
                    "products": [
                      {
                        "name": "product 1",
                        "price": "12.00",
                        "quantity": 2,
                        "weight": 0.5
                      }
                    ],
                    "coupon": "ABC100"
                  }"""))
                .andReturn()
                .getResponse()

        then:
        response.status == 200
        1 * orderFacade.createOrder(*_) >> true
    }
}
