package edu.fiap.netflix;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface ContentRepository extends CrudRepository<Content, Long> {
	
	List<Content> findByName(String name);
	List<Content> findByGenre(int genreID);

}
