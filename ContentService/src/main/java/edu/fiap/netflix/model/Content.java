package edu.fiap.netflix.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "content")	
public class Content implements Comparable<Content>{

	@Id
	@Column(name = "id", nullable = false)
	private int id;
	@Column(name = "name", nullable = false)
	private String name;
	@Column(name = "genre", nullable = false)
    private Integer genre;
	@Column(name = "views", nullable = false)
    private Integer views; 
	
    public Content() {
    	
    }
    
    public Content(int id, String name, int genre, int views) {
    	this.name = name;
    	this.genre = genre;
    	this.views = views;
    	this.id = id;
    }
    
	@Override
	public String toString() {
		return "Content [id=" + id + ", name=" + name + ", genre=" + genre + "]";
	}

	public int getId() {
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
