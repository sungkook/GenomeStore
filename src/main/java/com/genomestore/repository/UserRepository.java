package com.genomestore.repository;

import org.springframework.data.repository.CrudRepository;

import com.genomestore.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
}
