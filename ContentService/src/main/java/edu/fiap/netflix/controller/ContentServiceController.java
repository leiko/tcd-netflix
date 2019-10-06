package edu.fiap.netflix.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.fiap.netflix.model.Content;
import edu.fiap.netflix.repository.ContentRepository;

@RestController
@RequestMapping(value = "netflix")
public class ContentServiceController {

	private static final Logger log = LoggerFactory.getLogger(ContentServiceController.class);

	@Autowired
	private ContentRepository contentRepository;

	@RequestMapping(value = "/findContentByName/{contentName}", method = RequestMethod.GET)
	public List<Content> findContentByName(@PathVariable("contentName") String name) {

		log.info("---findContentByName:");
		contentRepository.findByName(name).forEach(x -> log.info(x.getName()));

		return (List<Content>) contentRepository.findByName(name);
	}

	@RequestMapping(value = "/findContentByGenre/{genreID}", method = RequestMethod.GET)
	public List<Content> findContentByName(@PathVariable("genreID") int genreID) {

		log.info("---findContentByGenre:");
		contentRepository.findByGenre(genreID).forEach(x -> log.info(x.getName()));

		return (List<Content>) contentRepository.findByGenre(genreID);
	}

	@RequestMapping(value = "/mostViewedByGenre/{genreID}", method = RequestMethod.GET)
	public List<Content> mostViewedByGenre(@PathVariable("genreID") int genreID) {

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

}
