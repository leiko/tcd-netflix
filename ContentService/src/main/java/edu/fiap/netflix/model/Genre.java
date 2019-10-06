package edu.fiap.netflix.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "genre")	
public class Genre {

	@Id
	@Column(name = "id", nullable = false)
	private int id;
	@Column(name = "name", nullable = false)
	private String name;

	@Override
	public String toString() {
		return "Genre [id=" + id + ", name=" + name + "]";
	}

	public Genre() {

	}

	public Genre(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
