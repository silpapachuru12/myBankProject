package com.example.demo.service;

import com.example.demo.entity.User;


public interface UserService {
	public User updateUser(User user);
	public User getUserDetails(Integer id);
	public User saveUser(User user);
	
    public  User deleteUser(User user);
}
	
	



