package com.backendchallenges.uberemailservice.controllers;

import com.backendchallenges.uberemailservice.application.EmailSenderService;
import com.backendchallenges.uberemailservice.core.EmailRequest;
import com.backendchallenges.uberemailservice.core.exceptions.EmailServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/email")
public class EmailSenderController {
    /* OBS: note que o controller depende da implementação do use-case, da camada application
    (EmailSenderService implementa EmailSenderUseCase). Já o EmailSenderService depende da interface adapter
    EmailSenderGateway. A classe SesEmailSender implementa o adapter sendo injetada no EmailSenderService,
    que vai ser utilizado pelo controller. */
    private final EmailSenderService emailSenderService;

    @Autowired
    public EmailSenderController(EmailSenderService emailService) {
        this.emailSenderService = emailService;
    }

    @PostMapping()
    public ResponseEntity<String> sendEmail(@RequestBody EmailRequest request) {
        try {
            this.emailSenderService.sendEmail(request.to(), request.subject(), request.body());
            return ResponseEntity.ok("Email send successfully");
        } catch (EmailServiceException exception) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error while sending email");
        }
    }
}
