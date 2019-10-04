package edu.fiap.netflix;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NetflixApplication{

	private static final Logger log = LoggerFactory.getLogger(NetflixApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(NetflixApplication.class, args);
	}

}
