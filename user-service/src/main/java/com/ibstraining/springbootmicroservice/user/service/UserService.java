package com.ibstraining.springbootmicroservice.user.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ibstraining.springbootmicroservice.user.entity.User;
import com.ibstraining.springbootmicroservice.user.repository.UserRepository;


@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;


	public User saveUser(User user) {
		return userRepository.save(user);
	}


	public Optional<User> getUser(long userId) {
		return userRepository.findById(userId);
	}

	
}