package com.felipearaujo.forum.services;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipearaujo.forum.domain.entities.User;
import com.felipearaujo.forum.repositories.UserRepository;
import com.felipearaujo.forum.services.exceptions.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> findAll() {
		List<User> users = userRepository.findAll();
		return users;
	}
	
	public User findById(String id) {
		try {
			Optional<User> user = userRepository.findById(id);
			return user.get();
		}catch(NoSuchElementException e) {
			throw new ObjectNotFoundException("Id not found : " + id);
		}
	}
}
