package com.startup.demo.model.account.repo;

import java.util.Optional;
import java.util.UUID;

import com.startup.demo.model.BaseRepository;
import com.startup.demo.model.account.entity.Account;

public interface AccountRepo extends BaseRepository<Account, UUID>{
	
	Optional<Account> findOneByEmail(String email);

}
