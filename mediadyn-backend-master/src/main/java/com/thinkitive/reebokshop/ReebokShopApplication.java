package com.thinkitive.reebokshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

import com.thinkitive.reebokshop.configuration.FileStorageProperties;

@SpringBootApplication
@ComponentScan("com.thinkitive.reebokshop")
@EnableConfigurationProperties({
	FileStorageProperties.class
})
public class ReebokShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReebokShopApplication.class, args);
		System.out.println("Hello");
	}
}