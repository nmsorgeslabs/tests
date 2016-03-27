package org.nms.tests.springbootdocker;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController{
	
	private final static Logger LOG = LoggerFactory.getLogger(ApiController.class);

	@RequestMapping("/")
	public String home() {
		
		LOG.info("Request to home"+getHostIp());
		
		return "First spring boot response ever!";
	}
	
	@RequestMapping("/about")
	public String about(){
		return "Version 0.0.1-alpha";
	}
	
	private String getHostIp(){
		
		try {
			return InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			return "Unknown host IP";
		}
	}
}
