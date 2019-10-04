package edu.fiap.netflix;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;

	//private Set<History> history = new HashSet<>();
	
	@ElementCollection(fetch = FetchType.EAGER)
	private Collection<String> history = new ArrayList<String>();

	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "user_favorites", joinColumns = @JoinColumn(name = "user_id"))
	@Column(name = "favorites")
	private Set<Integer> favorites = new HashSet<>();

	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "user_list", joinColumns = @JoinColumn(name = "user_id"))
	@Column(name = "list")
	private Set<Integer> list = new HashSet<>();

	public User() {

	}

	public User(String name, Collection<String> history, Set<Integer> list, Set<Integer> favorites) {
		this.name = name;
		this.history = history;
		this.list = list;
		this.favorites = favorites;
	}

	public Long getId() {
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
