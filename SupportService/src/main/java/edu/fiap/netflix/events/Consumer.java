package edu.fiap.netflix.events;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

import edu.fiap.netflix.events.CustomChannels;
import edu.fiap.netflix.model.Ticket;
import edu.fiap.netflix.service.TicketService;

@EnableBinding(CustomChannels.class)
public class Consumer {

	private static final Logger logger = LoggerFactory.getLogger(Consumer.class);

	@Autowired
	private TicketService ticketService;
	
	@StreamListener("inboundTicketAlert")
	public void loggerSink(String msg) {
		
		logger.debug("New ticket alert! " + msg);
		
		ticketService.addTicket(msg);
	}

}
