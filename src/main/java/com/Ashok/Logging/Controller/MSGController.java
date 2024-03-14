package com.Ashok.Logging.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ashok.Logging.Service.MSGService;

@RestController
public class MSGController {
	@Autowired
	//private com.Ashok.Logging.Service.MSGService msgService;
	private MSGService msgService;
	
	@GetMapping("/welcome")
	public String getMsg() {
		return msgService.getWelcomeMsg();
	}
	

}
