package com.example._thFeb_Product_Category.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example._thFeb_Product_Category.Entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

    List<Product> findByProductNameContaining(String name);

    List<Product> findByCategoryCategoryId(Long categoryId);
	
}

