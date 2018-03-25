package com.sb.booter.backend.persistence.domain.backend;

import org.springframework.mail.SimpleMailMessage;

import com.sb.booter.web.domain.frontend.FeedbackPojo;

public interface EmailService {
	
	
	public void sendFeedbackEmail(FeedbackPojo feedback);
	
	public void sendGenericEmail(SimpleMailMessage message);

}
