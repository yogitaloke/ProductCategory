package com.example.yogita.projection;

import java.util.List;

import com.example.yogita.entity.Product;

public interface CategoryProjection {
	public int getCategoryId();
	public String getCategoryName();
	public List<Product> getProduct();
	
	interface Product{
		public int getProductId();
		public String getProductName();
	}

}
