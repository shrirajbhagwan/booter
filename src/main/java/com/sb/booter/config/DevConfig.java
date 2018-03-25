package com.sb.booter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import com.sb.booter.backend.persistence.domain.backend.EmailService;
import com.sb.booter.backend.persistence.domain.backend.MockEmailService;

@Configuration
@Profile("dev")
@PropertySource("file:///${user.home}/.booter/application-dev.properties")
public class DevConfig {

	@Bean
	public EmailService emailService(){
		return new MockEmailService();
	}
}
