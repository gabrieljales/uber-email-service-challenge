package com.backendchallenges.uberemailservice.core;

// Classes Record: classes que possuem apenas campos (atributos) e nenhum comportamento adicional.
// Nesse caso, EmailRequest atua como um DTO
public record EmailRequest(String to, String subject, String body) {
}
