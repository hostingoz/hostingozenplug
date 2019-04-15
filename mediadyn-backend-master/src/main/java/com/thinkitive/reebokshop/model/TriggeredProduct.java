package com.thinkitive.reebokshop.model;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="trigger_product")
public class TriggeredProduct {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="path")
	private String path;
	
	@Column(name = "isTriggered")
	private boolean isTriggered;
	
	@Column(name="productName")
	private String productName;

	@Column(name="duration")
	private long duration;
	
	@Column(name="fileType")
	private String fileType;
	
	public TriggeredProduct() {
		super();
	}

	
	
	
	
	public TriggeredProduct(int id, String name, String path, boolean isTriggered, String productName, long duration,
			String fileType) {
		super();
		this.id = id;
		this.name = name;
		this.path = path;
		this.isTriggered = isTriggered;
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





	public boolean isTriggered() {
		return isTriggered;
	}





	public void setTriggered(boolean isTriggered) {
		this.isTriggered = isTriggered;
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
		return "TriggeredProduct [id=" + id + ", name=" + name + ", path=" + path + ", isTriggered=" + isTriggered
				+ ", productName=" + productName + ", duration=" + duration + ", fileType=" + fileType + "]";
	}

	
	
	
	
	
	

}
