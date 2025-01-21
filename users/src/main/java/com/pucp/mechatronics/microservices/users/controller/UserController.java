package com.pucp.mechatronics.microservices.users.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pucp.mechatronics.microservices.users.entity.User;
import com.pucp.mechatronics.microservices.users.services.UserService;

@RestController

public class UserController {
	@Autowired UserService service;
	
	@GetMapping 
	public ResponseEntity <?> list(){
		return ResponseEntity.ok().body(service.findAll());
	}
	
	@GetMapping ("/{id}")
	public ResponseEntity <?> see(@PathVariable Long id){
		Optional <User> o = service.findById(id);
		if (o != null && !o.isPresent() || o == null) {
			return ResponseEntity.notFound().build();	
					}
		return ResponseEntity.ok().body(o);
	}
	
	@PostMapping 
	public ResponseEntity<?> create(@RequestBody User user){
		User userDb = service.save(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(userDb);
	}
	
	@PutMapping
	public ResponseEntity<?> edit(@RequestBody User user,@PathVariable Long id){
		Optional <User> o = service.findById(id);
		if (o != null && !o.isPresent() || o == null) {
			return ResponseEntity.notFound().build();	
					}
		User userDb = o.get();
		userDb.setName(user.getName());
		userDb.setLastname(user.getLastname());
		userDb.setEmail(user.getEmail());
		
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(userDb));
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id){
		service.deleteById(id);
		return ResponseEntity.noContent().build();
	}
	
	
}