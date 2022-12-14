package com.server.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.server.model.Role;
import com.server.model.User;
import com.server.model.UserRole;
import com.server.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {
	
	@Autowired
	private UserService userService;

	//creating user
	@PostMapping("/")
	public User createUser(@RequestBody User user) throws Exception {
		
	
		
		Role role = new Role();
		role.setRoleid(200L);
		role.setRolename("NORMAL");
		
		Set<UserRole> roles = new HashSet<>();
		
		UserRole userRole = new UserRole();
		userRole.setRole(role);
		userRole.setUser(user);
		
		roles.add(userRole);
		return this.userService.createUser(user, roles);
		
	}
	
	//getting user by username
	@GetMapping("/{username}")
	public User getUser(@PathVariable("username") String username) {
		
		return this.userService.getUser(username);
		
	}
	
	//deleting user by userid
	@DeleteMapping("/{userId}")
	public void deleteUser(@PathVariable("userId") Long userId) {
		
		this.userService.deleteUser(userId);
	}
	
	
}
