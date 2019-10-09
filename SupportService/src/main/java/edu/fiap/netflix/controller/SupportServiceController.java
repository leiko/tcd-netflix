package edu.fiap.netflix.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.fiap.netflix.model.Ticket;
import edu.fiap.netflix.service.Consumer;
import edu.fiap.netflix.service.Producer;

@RestController
@RequestMapping(value = "netflix/support")
public class SupportServiceController {

	@Autowired
	private Producer producer;

	@Autowired
	private Consumer consumer;

	@RequestMapping(value = "/ticket/open", method = RequestMethod.PUT)
	public void openTicket(@RequestBody Ticket ticket) {
		producer.openTicket(ticket);

	}

	@RequestMapping(value = "/ticket/viewQueue", method = RequestMethod.GET)
	public List<Ticket> viewQueue() {
		return consumer.viewQueue();

	}

}
