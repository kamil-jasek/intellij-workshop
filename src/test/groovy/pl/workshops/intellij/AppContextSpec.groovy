package pl.workshops.intellij

import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class AppContextSpec extends Specification {

    def 'spring context must be loaded'() {
        expect:
        1 == 1
    }
}
