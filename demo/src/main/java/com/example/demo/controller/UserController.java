package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import com.example.demo.service.UserServiceImpl;

import jakarta.persistence.EntityNotFoundException;

@RestController
public class UserController {
	
	@Autowired
	private UserServiceImpl service;
	
	@PostMapping("/saveUserData")
	public User saveUser(@RequestBody User user) {
		
		return service.saveUser(user);
	}
	
	@PutMapping("/userUpdate")
	public User updateUser(@RequestBody User user) {
		
		return service.updateUser(user);
	}

	@GetMapping("/getUserData")
	public User getUserDetails(@RequestBody User user) {
		return service.getUserDetails(user);
	}
	
	
	@DeleteMapping("/deleteUserData")
	public User deleteUser(@RequestBody User user) {
		return service.deleteUser(user);
		
	}
	
	 }

