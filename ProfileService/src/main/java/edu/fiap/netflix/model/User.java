package edu.fiap.netflix.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "user")	
public class User {

	@Id
	@Column(name = "id", nullable = false)
	private int id;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "user_history", joinColumns = @JoinColumn(name = "user_id"))
	private Collection<String> history = new ArrayList<String>();

	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "user_favorites", joinColumns = @JoinColumn(name = "user_id"))
	private Set<Integer> favorites = new HashSet<>();

	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "user_list", joinColumns = @JoinColumn(name = "user_id"))
	private Set<Integer> list = new HashSet<>();

	public User() {

	}

	public User(int id, String name, Collection<String> history, Set<Integer> list, Set<Integer> favorites) {
		this.id = id;
		this.name = name;
		this.history = history;
		this.list = list;
		this.favorites = favorites;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Collection<String> getHistory() {
		return history;
	}

	public void setHistory(ArrayList<String> history) {
		this.history = history;
	}

	public Set<Integer> getFavorites() {
		return favorites;
	}

	public void setFavorites(Set<Integer> favorites) {
		this.favorites = favorites;
	}

	public Set<Integer> getList() {
		return list;
	}

	public void setList(Set<Integer> list) {
		this.list = list;
	}
	
}
