package com.concept.pucp.microservices.app.users.models.entity;

public class User {
	private long id;
	private String Name;
	private String Lastnames;
	private String email;
	
	public User() {
		super();
	}

	public User(long id, String name, String lastnames, String email) {
		super();
		this.id = id;
		Name = name;
		Lastnames = lastnames;
		this.email = email;
	}

	public User(String name, String lastnames, String email) {
		super();
		Name = name;
		Lastnames = lastnames;
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getLastnames() {
		return Lastnames;
	}

	public void setLastnames(String lastnames) {
		Lastnames = lastnames;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
