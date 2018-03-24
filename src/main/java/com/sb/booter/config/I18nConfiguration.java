package com.sb.booter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class I18nConfiguration {

	//Bean method name must be messageSource to initialized the messages
	@Bean
	public ReloadableResourceBundleMessageSource messageSource(){
		ReloadableResourceBundleMessageSource bundleMessageSource =  new ReloadableResourceBundleMessageSource();
		bundleMessageSource.setBasename("classpath:i18n/messages"); //look in the i18n folder in resources
		bundleMessageSource.setCacheSeconds(1800); // Invalidate and refill cache evey 30 minutes
		return bundleMessageSource;
	}
}
