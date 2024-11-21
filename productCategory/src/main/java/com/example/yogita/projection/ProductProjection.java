package com.example.yogita.projection;

import com.example.yogita.entity.Category;

public interface ProductProjection {
	
	public int getProductId();
	public String getProductName();
	public Category getCategory();
	
	interface Category{
		public int getCategoryId();
	}

}
