package pl.workshops.intellij.order;

import org.springframework.stereotype.Component;

@Component
class EmailSender {
    public boolean sendEmail(String email, String subject, String body) {
        throw new UnsupportedOperationException("cannot send email");
    }
}
