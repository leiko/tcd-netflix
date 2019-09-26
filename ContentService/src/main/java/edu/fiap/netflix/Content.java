package edu.fiap.netflix;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Content {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
    private int genre;
	
    public Content() {
    	
    }
    
    public Content(String name, int genre) {
    	this.name = name;
    	this.genre = genre;
    }
    
	@Override
	public String toString() {
		return "Content [id=" + id + ", name=" + name + ", genre=" + genre + "]";
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getGenre() {
		return genre;
	}

}
