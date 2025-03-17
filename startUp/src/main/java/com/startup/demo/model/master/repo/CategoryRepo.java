package com.startup.demo.model.master.repo;

import java.util.Locale.Category;
import java.util.Optional;

import com.startup.demo.model.BaseRepository;

public interface CategoryRepo extends BaseRepository<Category, Integer>{
	
	long countByNameIgnoreCase(String name);
	
	Optional<Category> findOneByName(String name);

}
