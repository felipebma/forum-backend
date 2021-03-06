package com.felipearaujo.forum.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.felipearaujo.forum.domain.entities.User;
import com.felipearaujo.forum.repositories.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		
		User u1 = new User(null, "Felipe Araujo", "felipe@gmail.com");
		User u2 = new User(null, "Maria Brown", "maria@gmail.com");
		User u3 = new User(null, "John Doe", "bob@gmail.com");

		userRepository.saveAll(Arrays.asList(u1, u2, u3));
	}

}
