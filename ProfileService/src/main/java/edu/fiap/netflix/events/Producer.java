package edu.fiap.netflix.events;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Producer {
	
	private static final Logger logger = LoggerFactory.getLogger(SimpleSourceBean.class);
	
	@Autowired
	private SimpleSourceBean simpleSourceBean;

	
	public void publishTicket(String description) {
		
		logger.debug("Producer Kafka sending message for ticket alert...}");
		simpleSourceBean.publishTicket(description);
		
	}
	
}
