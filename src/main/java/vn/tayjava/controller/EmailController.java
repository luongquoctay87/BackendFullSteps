package vn.tayjava.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import vn.tayjava.service.EmailService;

@Slf4j
@RestController
public record EmailController(EmailService emailService) {

    @PreAuthorize("hasAnyAuthority('MANAGER')")
    @GetMapping("/send-email")
    public void sendEmail(@RequestParam String toEmail, @RequestParam String subject, @RequestParam String body) {
        emailService.send(toEmail, subject, body);
        log.info("Email sent");
    }
}
