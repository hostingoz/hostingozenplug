package com.thinkitive.reebokshop.dto;

public class ProductDTO {

	private String name;

	private String img;

	private String productName;

	public ProductDTO(String name, String img, String productName) {
		super();
		this.name = name;
		this.img = img;
		this.productName = productName;
	}

	public ProductDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public String toString() {
		return "ProductDTO [name=" + name + ", img=" + img + ", productName=" + productName + "]";
	}

}
