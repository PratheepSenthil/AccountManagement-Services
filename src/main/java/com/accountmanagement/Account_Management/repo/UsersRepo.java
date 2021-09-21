package com.accountmanagement.Account_Management.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.accountmanagement.Account_Management.entity.Users;

@Repository
public interface UsersRepo extends MongoRepository<Users, Integer> {

	// you can build custom queries here
	
}