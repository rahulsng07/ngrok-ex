package com.ngrok.springboot_ngrok_testing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
	// hello this is test of jenkins only
	// hello jenkins
public class MyController {
	@Autowired
	@RequestMapping("/test")
	public String test()
	{
		return "This is ngrok test only";
		
	}
	@RequestMapping("/post")
	public String post()
	{
		return " Hi ngrok";
	}
	@RequestMapping("/get")
	public String get()
	{
		return "Test this";
	}

}
