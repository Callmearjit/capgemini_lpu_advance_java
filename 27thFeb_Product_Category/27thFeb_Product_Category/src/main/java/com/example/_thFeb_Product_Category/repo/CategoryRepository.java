package com.example._thFeb_Product_Category.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example._thFeb_Product_Category.Entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}

