package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repo.userRepo;


public interface UserService {
	public User updateUser(User user);
	public User getUserDetails(User user);
	public User saveUser(User user);
	
    public  User deleteUser(User user);
}
	
	



