package edu.fiap.netflix.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import edu.fiap.netflix.model.Ticket;

@Service
public class Producer {

	private static final Logger log = LoggerFactory.getLogger(Producer.class);
	
	public void openTicket(Ticket ticket) {

		log.info("New ticket: " + ticket);	
		
	}

}
