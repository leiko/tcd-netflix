package edu.fiap.netflix;

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

@RestController
@RequestMapping(value = "netflix")
public class ContentServiceController {

	private static final Logger log = LoggerFactory.getLogger(ContentServiceController.class);

	@Autowired
	private ContentRepository contentRepository;

	@Autowired
	private GenreRepository genreRepository;

	@RequestMapping(value = "/addContent", method = RequestMethod.GET)
	public void addContent() {

		log.info("---addContent---");

		contentRepository.save(new Content("La la land", 4, 20));
		contentRepository.save(new Content("Harry Potter", 2, 100));
		contentRepository.save(new Content("Carros", 2, 100));
		contentRepository.save(new Content("IT", 1, 35));
		contentRepository.save(new Content("X", 1, 100));
		contentRepository.save(new Content("Y", 1, 42));
		contentRepository.save(new Content("Z", 1, 4));
	}

	@RequestMapping(value = "/addGenre", method = RequestMethod.GET)
	public void addGenre() {

		log.info("---addGenres---");

		genreRepository.save(new Genre(1, "Terror"));
		genreRepository.save(new Genre(2, "Aventura"));
		genreRepository.save(new Genre(3, "Infantil"));
		genreRepository.save(new Genre(4, "Romance"));

	}

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
