package com.felipearaujo.forum.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felipearaujo.forum.domain.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public static ResponseEntity<List<User>> findAll() {
		User u1 = new User("1", "Felipe Araujo", "felipe@gmail.com");
		User u2 = new User("2", "Maria Brown", "maria@gmail.com");
		return ResponseEntity.ok(Arrays.asList(u1, u2));
	}

}
