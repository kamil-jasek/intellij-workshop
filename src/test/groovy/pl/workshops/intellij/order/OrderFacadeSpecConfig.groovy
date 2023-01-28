package pl.workshops.intellij.order

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Primary
import spock.mock.DetachedMockFactory

class OrderFacadeSpecConfig {

    def mockFactory = new DetachedMockFactory()

    @Bean
    @Primary
    EmailSender testEmailSender() {
        return mockFactory.Mock(EmailSender)
    }
}
