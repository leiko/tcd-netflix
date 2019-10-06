package edu.fiap.netflix.controller;

import java.util.Collection;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.fiap.netflix.model.User;
import edu.fiap.netflix.repository.UserRepository;

@RestController
@RequestMapping(value = "netflix/profile")
public class ProfileServiceController {

	private static final Logger log = LoggerFactory.getLogger(ProfileServiceController.class);

	@Autowired
	private UserRepository repository;

	@RequestMapping(value = "/view/history/{userID}", method = RequestMethod.GET)
	public Collection<String> viewHistory(@PathVariable("userID") int userID) {

		log.info("---viewHistory---");
		
		User user = repository.findById(userID);
		
		Collection<String> history = user.getHistory();
				
		for (String item : history) {			
			log.info("item: " + item);			
		}
		
		return user.getHistory();
	
	}

	@RequestMapping(value = "/add/favorite/{userID}/{contentID}", method = RequestMethod.PUT)
	public void addFavorite(@PathVariable("userID") int userID, @PathVariable("contentID") int contentID) {

		log.info("---addFavorite: " + userID + " " + contentID);

		User user = repository.findById(userID);
		Set<Integer> favorites = user.getFavorites();
		favorites.add(contentID);
		
		repository.save(user);

	}
	
	@RequestMapping(value = "/add/list/{userID}/{contentID}", method = RequestMethod.PUT)
	public void addToList(@PathVariable("userID") int userID, @PathVariable("contentID") int contentID) {

		log.info("---addToList: " + userID + " " + contentID);

		User user = repository.findById(userID);
		Set<Integer> list = user.getList();
		list.add(contentID);
		
		repository.save(user);

	}

}
