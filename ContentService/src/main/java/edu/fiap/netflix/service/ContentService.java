package edu.fiap.netflix.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

import edu.fiap.netflix.model.Content;
import edu.fiap.netflix.repository.ContentRepository;

@Service
public class ContentService {

	private static final Logger log = LoggerFactory.getLogger(ContentService.class);

	@Autowired
	private ContentRepository contentRepository;

	@HystrixCommand(fallbackMethod = "buildFallbackFindContentByName", commandProperties = {
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "9000") })
	public List<Content> findContentByName(String name) {

		log.info("---findContentByName:");
		contentRepository.findByName(name).forEach(x -> log.info(x.getName()));
		
		return (List<Content>) contentRepository.findByName(name);
	}

	@HystrixCommand(fallbackMethod = "buildFallbackViewByGenre", commandProperties = {
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "9000") })
	public List<Content> findContentByGenre(int genreID) {

		log.info("---findContentByGenre:");
		contentRepository.findByGenre(genreID).forEach(x -> log.info(x.getName()));
		
		return (List<Content>) contentRepository.findByGenre(genreID);
	}

	@HystrixCommand(fallbackMethod = "buildFallbackViewByGenre", commandProperties = {
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "9000") })
	public List<Content> mostViewedByGenre(int genreID) {

		log.info("---mostViewedByGenre:");
		
		List<Content> content = contentRepository.findByGenre(genreID);

		Collections.sort(content, Collections.reverseOrder());

		List<Content> top3 = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			if (i < content.size())
				top3.add(content.get(i));
		}
		

		return top3;
	}

	public List<Content> buildFallbackFindContentByName(String name) {

		List<Content> list = new ArrayList<>();

		Content content = new Content();
		content.setName("timeout");
		list.add(content);

		return list;
	}
	
	public List<Content> buildFallbackViewByGenre(int name) {

		List<Content> list = new ArrayList<>();

		Content content = new Content();
		content.setName("timeout");
		list.add(content);

		return list;
	}
	
}
