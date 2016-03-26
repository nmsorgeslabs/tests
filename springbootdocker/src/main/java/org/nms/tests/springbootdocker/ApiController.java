package org.nms.tests.springbootdocker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController{

	@RequestMapping("/")
	public String home() {
		return "First spring boot response ever!";
	}
	
	@RequestMapping("/about")
	public String about(){
		return "Version 0.0.1-alpha";
	}
}
