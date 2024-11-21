package com.example.yogita.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.yogita.entity.Category;
import com.example.yogita.projection.CategoryProjection;
import com.example.yogita.projection.ProductProjection;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
	
	List<CategoryProjection> findBy();

}
