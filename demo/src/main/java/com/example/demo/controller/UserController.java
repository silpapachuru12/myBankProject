package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.globalExceptionHandler.EmptyInputException;
import com.example.demo.service.UserServiceImpl;

import java.lang.*;

import jakarta.websocket.server.PathParam;

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
	public User getUserDetails(@RequestParam Integer id) throws EmptyInputException {
		User u =null;
		boolean b=false;
		try {
			if(b) {
			u=service.getUserDetails(id);
			}else {
				throw new EmptyInputException("request is invalid");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return u;
	}
	
	
	@DeleteMapping("/deleteUserData")
	public User deleteUser(@RequestBody User user) {
		return service.deleteUser(user);
		
	}
	
	 }

