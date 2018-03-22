package com.sb.booter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloSBController {
	
	@RequestMapping("/")
	public String hello(){
		return "index";
	}

}
