package edu.fiap.netflix.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import edu.fiap.netflix.model.Content;


public interface ContentRepository extends CrudRepository<Content, Long> {
	
	List<Content> findByName(String name);
	List<Content> findByGenre(int genreID);

}
