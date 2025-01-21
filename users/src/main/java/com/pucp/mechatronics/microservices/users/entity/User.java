package com.pucp.mechatronics.microservices.users.entity;

public class User {
	private long id;
	private String Name;
	private String Lastname;
	private String email;
	
	public User() {
		super();
	}

	public User(long id, String name, String lastname, String email) {
		super();
		this.id = id;
		Name = name;
		Lastname = lastname;
		this.email = email;
	}

	public User(String name, String lastname, String email) {
		super();
		Name = name;
		Lastname = lastname;
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

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
