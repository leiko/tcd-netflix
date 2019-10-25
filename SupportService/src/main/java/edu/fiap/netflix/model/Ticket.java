package edu.fiap.netflix.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ticket")	
public class Ticket {

	@Id
	@Column(name = "id", nullable = false)
	private int id;
	
	@Column(name = "user_id", nullable = false)
	private int user_id;
	
	@Column(name = "title", nullable = false)
	private String title;
	
	@Column(name = "description", nullable = false)
	private String description;
	
	@Column(name = "status", nullable = false)
	private String status;
	
	public Ticket() {
		
	}

	public int getId() {
		return id;
	}

	public int getUser_id() {
		return user_id;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", user_id=" + user_id + ", title=" + title + ", description=" + description
				+ ", status=" + status + "]";
	}
	
}
