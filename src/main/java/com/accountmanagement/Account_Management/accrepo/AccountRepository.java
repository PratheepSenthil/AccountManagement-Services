package com.accountmanagement.Account_Management.accrepo;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;



@Repository
public interface AccountRepository extends MongoRepository<Account, Integer> {

	// you can build custom queries here
	
}
