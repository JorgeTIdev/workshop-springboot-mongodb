package com.jnascimento.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jnascimento.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String> {

}
