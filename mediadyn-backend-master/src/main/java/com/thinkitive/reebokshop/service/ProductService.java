package com.thinkitive.reebokshop.service;

import org.springframework.http.ResponseEntity;

import com.thinkitive.reebokshop.dto.ProductDTO;

public interface ProductService {
	public ResponseEntity<?> addProduct(ProductDTO productDTO);

}
