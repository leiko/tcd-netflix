package edu.fiap.netflix.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.fiap.netflix.events.Producer;
import edu.fiap.netflix.service.ProfileService;

@RestController
@RequestMapping(value = "netflix/profile")
public class ProfileServiceController {

	@Autowired
	private ProfileService profileService;
	
	@Autowired
	private Producer producer;

	@RequestMapping(value = "/view/history/{userID}", method = RequestMethod.GET)
	public Collection<String> viewHistory(@PathVariable("userID") int userID) {

		return profileService.viewHistory(userID);

	}

	@RequestMapping(value = "/add/favorite/{userID}/{contentID}", method = RequestMethod.PUT)
	public void addFavorite(@PathVariable("userID") int userID, @PathVariable("contentID") int contentID) {

		profileService.addFavorite(userID, contentID);

	}

	@RequestMapping(value = "/add/list/{userID}/{contentID}", method = RequestMethod.PUT)
	public void addToList(@PathVariable("userID") int userID, @PathVariable("contentID") int contentID) {

		profileService.addToList(userID, contentID);

	}
	
	
	@RequestMapping(value = "/add/ticket/{userID}/{msg}", method = RequestMethod.PUT)
	public void addTicket(@PathVariable("userID") int userID, @PathVariable("msg") String description) {
		
		producer.publishTicket(description);

	}

}
