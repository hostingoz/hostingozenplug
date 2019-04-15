package com.thinkitive.reebokshop.service;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.thinkitive.reebokshop.dao.ProductDAO;
import com.thinkitive.reebokshop.dto.ProductDTO;
import com.thinkitive.reebokshop.model.Product;
import com.thinkitive.reebokshop.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductDAO productDao;
	
	@Override
	public ResponseEntity<?> addProduct(ProductDTO productDTO) {
		try {
			this.productDao.addProduct(productDTO);
			return ResponseEntity.status(HttpStatus.OK).body(null);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
	}

}
