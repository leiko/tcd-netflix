package edu.fiap.netflix.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.fiap.netflix.model.Ticket;
import edu.fiap.netflix.service.TicketService;

@RestController
@RequestMapping(value = "netflix/support")
public class SupportServiceController {

	@Autowired
	private TicketService ticketService;
	
	@RequestMapping(value = "/ticket/viewQueue", method = RequestMethod.GET)
	public List<Ticket> viewQueue() {
		
		return ticketService.viewQueue();

	}

}
