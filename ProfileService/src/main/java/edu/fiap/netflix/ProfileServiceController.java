package edu.fiap.netflix;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "netflix/profile")
public class ProfileServiceController {

	private static final Logger log = LoggerFactory.getLogger(ProfileServiceController.class);

	@Autowired
	private UserRepository repository;
	
	@RequestMapping(value = "/addUsers", method = RequestMethod.GET)
	public void addUsers() {

		log.info("---addUsers---");
		
		Set<Integer> list = new HashSet<>();
		list.add(1);
		list.add(2);
        
		Set<Integer> favorites = new HashSet<>();
		favorites.add(2);
		favorites.add(1);
		
		Collection<String> history = new ArrayList<String>();
		history.add("03/10/2019 - UP");
		history.add("02/10/2019 - IT");
				
		repository.save(new User("Ana", history, list, favorites));
		
	}

	@RequestMapping(value = "/view/history/{userID}", method = RequestMethod.GET)
	public Collection<String> viewHistory(@PathVariable("userID") Long userID) {

		log.info("---viewHistory---");
		
		User user = repository.findById(userID);
		
		Collection<String> history = user.getHistory();
				
		for (String item : history) {			
			log.info("item: " + item);			
		}
		
		return user.getHistory();
	
	}

	@RequestMapping(value = "/add/favorite/{userID}/{contentID}", method = RequestMethod.PUT)
	public void addFavorite(@PathVariable("userID") Long userID, @PathVariable("contentID") Integer contentID) {

		log.info("---addFavorite: " + userID + " " + contentID);

		User user = repository.findById(userID);
		Set<Integer> favorites = user.getFavorites();
		favorites.add(contentID);
		
		repository.save(user);

	}
	
	@RequestMapping(value = "/add/list/{userID}/{contentID}", method = RequestMethod.PUT)
	public void addToList(@PathVariable("userID") Long userID, @PathVariable("contentID") Integer contentID) {

		log.info("---addToList: " + userID + " " + contentID);

		User user = repository.findById(userID);
		Set<Integer> list = user.getList();
		list.add(contentID);
		
		repository.save(user);

	}

}
