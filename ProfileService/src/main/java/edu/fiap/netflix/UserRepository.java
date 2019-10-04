package edu.fiap.netflix;



import org.springframework.data.repository.CrudRepository;



public interface UserRepository extends CrudRepository<User, Long> {
	
	User findById(Long userId);
	
}
