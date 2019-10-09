package edu.fiap.netflix.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

import edu.fiap.netflix.model.User;
import edu.fiap.netflix.repository.UserRepository;

@Service
public class ProfileService {

	private static final Logger log = LoggerFactory.getLogger(ProfileService.class);

	@Autowired
	private UserRepository repository;

	@HystrixCommand(fallbackMethod = "buildFallbackViewHistory", commandProperties = {
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "9000") })
	public Collection<String> viewHistory(int userID) {

		log.info("---viewHistory---");		
		
		User user = repository.findById(userID);

		Collection<String> history = user.getHistory();

		for (String item : history) {
			log.info("item: " + item);
		}
		return user.getHistory();

	}

	public void addFavorite(int userID, int contentID) {

		log.info("---addFavorite: " + userID + " " + contentID);

		User user = repository.findById(userID);
		Set<Integer> favorites = user.getFavorites();
		favorites.add(contentID);

		repository.save(user);

	}

	public void addToList(int userID, int contentID) {

		log.info("---addToList: " + userID + " " + contentID);

		User user = repository.findById(userID);
		Set<Integer> list = user.getList();
		list.add(contentID);

		repository.save(user);

	}
	
	public Collection<String> buildFallbackViewHistory(int userID) {

		Collection<String> history = new ArrayList<String>();
		history.add("timeout");
		return history;

	}

}
