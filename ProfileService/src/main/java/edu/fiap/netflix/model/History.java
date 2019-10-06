package edu.fiap.netflix.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class History {
	
	@Column(name = "date", nullable = false)
    private String date;
	
	@Column(name = "content", nullable = false)
    private String content;

    
    public History(String date, String content) {
    	this.date = date;
    	this.content = content;
    }
    
    public History() {
    	
    }
    
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

    
}
    
    

