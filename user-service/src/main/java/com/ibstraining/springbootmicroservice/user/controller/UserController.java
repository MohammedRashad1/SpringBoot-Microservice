package com.ibstraining.springbootmicroservice.user.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibstraining.springbootmicroservice.user.entity.User;
import com.ibstraining.springbootmicroservice.user.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	private UserService userService;
	
	@PostMapping("/")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
	

}