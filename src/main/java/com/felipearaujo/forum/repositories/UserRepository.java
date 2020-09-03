package com.felipearaujo.forum.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.felipearaujo.forum.domain.entities.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
