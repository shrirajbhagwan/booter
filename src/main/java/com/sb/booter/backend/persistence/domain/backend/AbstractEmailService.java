package com.sb.booter.backend.persistence.domain.backend;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;

import com.sb.booter.web.domain.frontend.FeedbackPojo;

public abstract class AbstractEmailService implements EmailService {

	@Value("${default.to.emailAddress}")
	private String defaultEmailAddress;

	protected SimpleMailMessage prepareSimpleMailMessageFromFeedbackPojo(FeedbackPojo feedback){
		SimpleMailMessage message =new SimpleMailMessage();
		message.setTo(defaultEmailAddress);
		message.setSubject("Feedback on Booter recieved from "+feedback.getFirstName()+" "+feedback.getLastName());
		message.setText(feedback.getEmail()+" "+feedback.getFeedback());
		return message;
	}

	@Override
	public void sendFeedbackEmail(FeedbackPojo feedback) {
		sendGenericEmail(prepareSimpleMailMessageFromFeedbackPojo(feedback));
	}

}
