package com.server;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.server.model.Role;
import com.server.model.User;
import com.server.model.UserRole;
import com.server.service.UserService;

@SpringBootApplication
public class ServerManagementSystemApplication implements CommandLineRunner{
	
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(ServerManagementSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Starting code...");
		
		/*User user = new User();
		user.setFirstname("Samarth");
		user.setLastname("Dev");
		user.setUsername("samarth123");
		user.setPassword("abc");
		user.setEmail("sam@gmail.com");
		user.setPhone("8563254125");
		
		Role role1 = new Role();
		role1.setRoleid(100L);
		role1.setRolename("ADMIN");
		
		Set<UserRole> userRoleSet = new HashSet<>();
		
		UserRole userRole = new UserRole();
		userRole.setRole(role1);
		userRole.setUser(user);
		
		userRoleSet.add(userRole);
		User user1 = this.userService.createUser(user, userRoleSet);
		System.out.println(user1.getUsername());
		*/
	}

}
