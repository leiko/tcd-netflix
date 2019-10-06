package edu.fiap.netflix.repository;


import org.springframework.data.repository.CrudRepository;

import edu.fiap.netflix.model.User;


public interface UserRepository extends CrudRepository<User, Long> {
	
	User findById(int userId);
	
}
