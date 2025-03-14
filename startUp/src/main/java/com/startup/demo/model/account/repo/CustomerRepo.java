package com.startup.demo.model.account.repo;

import java.util.Optional;
import java.util.UUID;

import com.startup.demo.model.BaseRepository;
import com.startup.demo.model.account.entity.Customer;

public interface CustomerRepo extends BaseRepository<Customer, UUID>{
	
	Optional<Customer> findOneByAccountEmail(String email);

}
