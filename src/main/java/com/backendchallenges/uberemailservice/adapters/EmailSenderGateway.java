package com.backendchallenges.uberemailservice.adapters;

// Contrato da aplicação com o provedor de email utilizado
public interface EmailSenderGateway {
    void sendEmail(String to, String subject, String body);
}
