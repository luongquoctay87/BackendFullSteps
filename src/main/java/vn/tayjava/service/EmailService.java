package vn.tayjava.service;

import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;
import jakarta.mail.internet.AddressException;
import jakarta.mail.internet.InternetAddress;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

@Slf4j
@Service
@RequiredArgsConstructor
public class EmailService {

    private final SendGrid sendGrid;

    public void send(String toEmail, String subject, String body) {
//        log.info("Sending email to {}", toEmail);
//
//        Email from = new Email("quoctay87@gmail.com");
//        Email to = new Email(toEmail);
//
//        Content content = new Content("text/plain", body);
//        Mail mail = new Mail(from, subject, to, content);
//
//        Request request = new Request();
//
//        try {
//            request.setMethod(Method.POST);
//            request.setEndpoint("mail/send");
//            request.setBody(mail.build());
//            Response response = sendGrid.api(request);
//            if (response.getStatusCode() == 202) {
//                log.info("Email sent successfully");
//            } else {
//                log.info("Email sent failed, body: {}", response.getBody());
//            }
//        } catch (IOException e) {
//            log.error("Send email was failure, errorMessage={}", e.getMessage());
//        }

        // Check gmail.com hoac tayjava.vn
        // check bang bash: telnet


    }
}
