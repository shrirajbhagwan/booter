package com.sb.booter.backend.persistence.domain.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

public class SMTPEmailService extends AbstractEmailService {

	
	/*Application Logger*/
	private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(SMTPEmailService.class);
	
	@Autowired
	private MailSender mailSender;
	
	@Override
	public void sendGenericEmail(SimpleMailMessage message) {
	LOG.debug("Sending Email...");
	mailSender.send(message);
	LOG.debug("Email Sent");
	}

}
