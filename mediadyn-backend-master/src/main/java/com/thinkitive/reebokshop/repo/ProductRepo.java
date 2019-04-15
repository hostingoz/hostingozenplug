package com.thinkitive.reebokshop.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thinkitive.reebokshop.model.Product;

@Repository
public interface ProductRepo  extends JpaRepository<Product, Integer>{

	Product findById(int id);
	Product findByName(String name);
	Product findByProductName(String productName);
	
}
