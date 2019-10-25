package edu.fiap.netflix.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fiap.netflix.model.Ticket;
import edu.fiap.netflix.repository.SupportRepository;

@Service
public class TicketService {

	@Autowired
	private SupportRepository repository;

	private List<Ticket> list = new ArrayList<>();
	
	
	public List<Ticket> addTicket(String msg) {

		Ticket ticket = new Ticket();
		
		ticket.setDescription(msg);
		
		repository.save(ticket);

		list.add(ticket);

		return list;

	}
	
	public List<Ticket> viewQueue() {
			
		for (Ticket ticket : repository.findAll()) {
			list.add(ticket);
		}
				
		return list;
	
	}
}
