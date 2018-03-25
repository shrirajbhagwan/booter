package com.sb.booter.web.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sb.booter.backend.persistence.domain.backend.EmailService;
import com.sb.booter.web.domain.frontend.FeedbackPojo;

@Controller
public class FeedbackController {

	/*Application Logger*/
	private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(FeedbackController.class);
	public static final String FEEDDBACK_MODEL = "feedback_model";
	
	@Autowired
	private EmailService emailService;

	@RequestMapping(value="/feedback",method=RequestMethod.GET)
	public String feedback(ModelMap modelMap){
		FeedbackPojo feedbackPojo = new FeedbackPojo();
		modelMap.addAttribute(FeedbackController.FEEDDBACK_MODEL, feedbackPojo);
		return "feedback";
	}


	@RequestMapping(value="/feedback",method=RequestMethod.POST)
	public String feedbackPost(@ModelAttribute(FeedbackController.FEEDDBACK_MODEL) FeedbackPojo feedback){
		LOG.debug("Form data is {}"+feedback);
		emailService.sendFeedbackEmail(feedback);
		return "feedback";
	}
}
