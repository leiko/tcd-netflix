package edu.fiap.netflix.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fiap.netflix.model.Ticket;
import edu.fiap.netflix.repository.SupportRepository;

@Service
public class Consumer {

	private static final Logger log = LoggerFactory.getLogger(Consumer.class);

	@Autowired
	private SupportRepository repository;

	private List<Ticket> list = new ArrayList<>();

	public List<Ticket> consume(Ticket ticket) {

		log.info("---- consume: ");
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
