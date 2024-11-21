package com.example.yogita.entity;

import jakarta.persistence.*;

@Entity (name="products")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int productId;
	
	String productName;
	
	@ManyToOne
	@JoinColumn(name="categoryId")
	Category category;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String productName, Category category) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.category = category;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", category=" + category + "]";
	}
	

}
