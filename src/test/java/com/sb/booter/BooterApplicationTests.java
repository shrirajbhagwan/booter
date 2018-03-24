package com.sb.booter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sb.booter.web.i18n.I18NService;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BooterApplicationTests {


	@Autowired
	private I18NService i18nService;
	
	@Test
	public void testMessageByLocaleService() throws Exception{
		String result ="My Index Page";
		String messageId="index.h1";
		String actual = i18nService.getMessage(messageId);
		Assert.assertEquals(result, actual);
	}
}
