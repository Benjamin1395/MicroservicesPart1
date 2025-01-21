package com.pucp.mechatronics.microservices.users.services;

import java.util.Optional;

import com.pucp.mechatronics.microservices.users.entity.User;

public interface UserService {
	
	public Iterable<User> findAll();
	public Optional <User> findById(Long id);
	public User save (User user);
	public void deleteById (Long id);

}
