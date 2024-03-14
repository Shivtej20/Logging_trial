package com.Ashok.Logging.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MSGService {
	
	//Implementing Logger 
	
	private Logger logger = LoggerFactory.getLogger(MSGService.class);
	
	public String getWelcomeMsg() {
		logger.info("getWelcomeMsg()....Started");
		String msg ="Hello All";
		logger.info("getWelcomeMsg()....Ended");
		return msg;
	}

}
