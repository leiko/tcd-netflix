package edu.fiap.netflix;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Embeddable
public class History {
	
    @NotNull
    @Size(max = 100)
    private String date;

    @NotNull
    @Size(max = 100)
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
    
    

