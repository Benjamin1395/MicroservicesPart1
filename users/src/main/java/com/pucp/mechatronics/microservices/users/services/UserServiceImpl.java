package com.pucp.mechatronics.microservices.users.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pucp.mechatronics.microservices.users.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public Iterable<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<User> findById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub

	}

}