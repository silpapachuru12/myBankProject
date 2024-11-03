package com.example.demo.service;

import java.util.Optional;

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
	public User getUserDetails(Integer id) {
		
		Optional<User>  u =repo.findById(id);
		return u.get();
	}

  @Override
  public User deleteUser(User user) {
	 repo.deleteById(user.getId());
	 return user;	
}

}


