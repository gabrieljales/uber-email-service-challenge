package com.backendchallenges.uberemailservice.core;

// Regra de negócio
public interface EmailSenderUseCase {
    void sendEmail(String to, String subject, String body);
}
