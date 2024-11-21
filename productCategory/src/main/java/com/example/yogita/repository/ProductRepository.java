package com.example.yogita.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.yogita.entity.Product;
import com.example.yogita.projection.ProductProjection;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	   List<ProductProjection> findBy();

	

}
