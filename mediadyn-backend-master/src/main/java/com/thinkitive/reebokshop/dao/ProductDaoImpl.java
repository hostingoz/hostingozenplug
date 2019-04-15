package com.thinkitive.reebokshop.dao;

import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.thinkitive.reebokshop.dto.ProductDTO;
import com.thinkitive.reebokshop.model.Product;
import com.thinkitive.reebokshop.repo.ProductRepo;

@Component
public class ProductDaoImpl implements ProductDAO {
	private static String UPLOADED_FOLDER = "/uploads";
	URL url = this.getClass().getResource("/images/PQR");

	@Autowired
	ProductRepo productRepo;

	@Override
	public void addProduct(ProductDTO productDTO) {
		try {
			byte[] imgByte = Base64.getDecoder().decode(productDTO.getImg());
			System.out.println("imgbyte is"+ imgByte);
			Product product = new Product();
			product.setName(productDTO.getName());
//			System.out.println(url.toString());
//			FileOutputStream fout = new FileOutputStream(url.toString());
			System.out.println("1");
			FileOutputStream fout = new FileOutputStream(UPLOADED_FOLDER);
			System.out.println("2");
			fout.write(imgByte);
			
			product.setPath(UPLOADED_FOLDER + productDTO.getName());
			Path path = Paths.get(UPLOADED_FOLDER + productDTO.getName());
//			Files.write(path, imgByte);
			this.productRepo.save(product);
		} catch (Exception e) {
			System.out.println("Exception in adding product" + e);
		}
	}

}
