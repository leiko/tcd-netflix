package edu.fiap.netflix.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.fiap.netflix.model.Genre;

@Repository
public interface GenreRepository extends CrudRepository<Genre, Long> {


}
