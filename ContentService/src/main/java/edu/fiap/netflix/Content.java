package edu.fiap.netflix;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Content implements Comparable<Content>{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
    private Integer genre;
    private Integer views; 
	
    public Content() {
    	
    }
    
    public Content(String name, int genre, int views) {
    	this.name = name;
    	this.genre = genre;
    	this.views = views;
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
	
	public Integer getViews() {
		return views;
	}

	public Integer getGenre() {
		return genre;
	}
	
    public int compareTo(Content o) {
        return this.getViews().compareTo(o.getViews());
    }

}
