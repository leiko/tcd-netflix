package edu.fiap.netflix;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Genre {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;

	@Override
	public String toString() {
		return "Genre [id=" + id + ", name=" + name + "]";
	}

	public Genre() {

	}

	public Genre(int id, String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
