package com.thinkitive.reebokshop.model;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Lob
	@Column(name="path")
	private String path;
	
	@Column(name="productName")
	private String productName;
	
	@Column(name="duration")
	private long duration;
	
	@Column(name="fileType")
	private String fileType;

	public Product() {
		super();
	}

	public Product(int id, String name, String path, String productName, long duration, String fileType) {
		super();
		this.id = id;
		this.name = name;
		this.path = path;
		this.productName = productName;
		this.duration = duration;
		this.fileType = fileType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", path=" + path + ", productName=" + productName
				+ ", duration=" + duration + ", fileType=" + fileType + "]";
	}

	

	
	
	


}
