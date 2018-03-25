package com.sb.booter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import com.sb.booter.backend.persistence.domain.backend.EmailService;
import com.sb.booter.backend.persistence.domain.backend.SMTPEmailService;

@Configuration
@Profile("prod")
@PropertySource("file:///${user.home}/.booter/application-prod.properties")
public class ProdConfig {

	@Bean
	public EmailService emailService(){
		return new SMTPEmailService();
	}
	
	
}
