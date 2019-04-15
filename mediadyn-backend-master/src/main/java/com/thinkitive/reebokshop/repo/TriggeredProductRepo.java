package com.thinkitive.reebokshop.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.thinkitive.reebokshop.model.TriggeredProduct;

@Repository
@Transactional
public interface TriggeredProductRepo extends JpaRepository<TriggeredProduct, Integer>{

	TriggeredProduct findById(int id);
	
	TriggeredProduct findByName(String name);
}
