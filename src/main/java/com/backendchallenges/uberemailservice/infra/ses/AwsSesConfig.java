package com.backendchallenges.uberemailservice.infra.ses;

import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Essa classe serve para que o Spring faça a instanciação correta da classe AmazonSimpleEmailService do SDK da AWS
// Então quando o SesEmailSender necessitar da classe AmazonSimpleEmailService e o Spring tem de fazer a injeção automaticamente,
// o Spring vai procurar por uma classe desse tipo e vai achar essa configuração
@Configuration // Indica ao Spring para executar essa classe antes de iniciar a aplicação
public class AwsSesConfig {
    @Bean
    public AmazonSimpleEmailService amazonSimpleEmailService() {
        return AmazonSimpleEmailServiceClientBuilder.standard().build();
    }
}
