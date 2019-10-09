package edu.fiap.netflix.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.fiap.netflix.model.Content;
import edu.fiap.netflix.service.ContentService;

@RestController
@RequestMapping(value = "netflix")
public class ContentServiceController {

	@Autowired
	private ContentService service;

	@RequestMapping(value = "/findContentByName/{contentName}", method = RequestMethod.GET)
	public List<Content> findContentByName(@PathVariable("contentName") String name) {

		return service.findContentByName(name);
	}

	@RequestMapping(value = "/findContentByGenre/{genreID}", method = RequestMethod.GET)
	public List<Content> findContentByGenre(@PathVariable("genreID") int genreID) {

		return service.findContentByGenre(genreID);
	}

	@RequestMapping(value = "/mostViewedByGenre/{genreID}", method = RequestMethod.GET)
	public List<Content> mostViewedByGenre(@PathVariable("genreID") int genreID) {

		return service.mostViewedByGenre(genreID);
	}

}
