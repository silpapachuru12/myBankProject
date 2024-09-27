package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repo.userRepo;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private userRepo repo;

	@Override
	public User saveUser(User user) {
		
		User u=repo.save(user);
		
		return u;
	}

}
