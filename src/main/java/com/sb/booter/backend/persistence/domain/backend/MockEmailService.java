package com.sb.booter.backend.persistence.domain.backend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.SimpleMailMessage;

public class MockEmailService extends AbstractEmailService {


	/*Application Logger*/
	private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(MockEmailService.class);

	@Override
	public void sendGenericEmail(SimpleMailMessage message) {

		LOG.debug("Mock Email");
		LOG.debug(message.toString());
		LOG.debug("Email Sent");
	}



}
