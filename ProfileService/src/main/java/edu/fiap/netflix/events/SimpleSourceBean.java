package edu.fiap.netflix.events;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
public class SimpleSourceBean {

	private static final Logger logger = LoggerFactory.getLogger(SimpleSourceBean.class);

	@Autowired
	private Source source;

	public void publishTicket(String description) {
		
		logger.debug("Producer Kafka sending message for ticket alert...}");
		source.output().send(MessageBuilder.withPayload("Ticket description: " + description).build());
		
	}

}
