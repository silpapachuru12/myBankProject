package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repo.userRepo;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private userRepo repo;
	
	@Override
	public User saveUser(User user) {
		User u=repo.save(user);
		return u;
	}

	@Override
	public User updateUser(User user) {
		User userDetails=repo.getById(user.getId());
		userDetails.setName(user.getName());
		userDetails.setAddress("Nellore");
		userDetails.setAccountNumber(267353412L);
		User u=repo.save(userDetails);
		return u;
	}
  @Override
	public User getUserDetails(User user) {
		User uDetails=repo.getById(user.getId());
		uDetails.getName();
		uDetails.getAddress();
		uDetails.getAccountNumber();
		User  u =repo.save(uDetails);
		return u;
	}

  @Override
  public User deleteUser(User user) {
	 repo.deleteById(user.getId());
	 return user;	
}

}


