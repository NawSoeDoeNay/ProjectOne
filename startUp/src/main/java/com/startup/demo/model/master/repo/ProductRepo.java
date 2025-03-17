package com.startup.demo.model.master.repo;

import java.util.Optional;

import com.startup.demo.model.BaseRepository;
import com.startup.demo.model.master.entity.Product;

public interface ProductRepo extends BaseRepository<Product, Integer>{

	Optional<Product> findOneByIdAndName(int categoryId, String name);
}
