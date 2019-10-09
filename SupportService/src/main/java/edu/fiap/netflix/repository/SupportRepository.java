package edu.fiap.netflix.repository;


import org.springframework.data.repository.CrudRepository;

import edu.fiap.netflix.model.Ticket;


public interface SupportRepository extends CrudRepository<Ticket, Long> {
	
}
