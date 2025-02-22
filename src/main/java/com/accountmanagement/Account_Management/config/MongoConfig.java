package com.accountmanagement.Account_Management.config;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import com.accountmanagement.Account_Management.entity.*;
import com.accountmanagement.Account_Management.repo.*;

@Configuration
@EnableMongoRepositories(basePackageClasses = CustomerRepository.class)
public class MongoConfig {
	
	@Bean
	public CommandLineRunner commandLineRunner(CustomerRepository repo) {
	

    return string -> { 
    	repo.insert(new Customers(1023457312,"ABCDE34521",1944023411,"Abinaya","Chennai","abcde123@gmail.com","12/07/2000"));
    	};	
		
	//return null;
	}

}








