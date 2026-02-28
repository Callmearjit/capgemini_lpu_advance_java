package com.example._thFeb_Product_Category.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example._thFeb_Product_Category.Entity.Category;
import com.example._thFeb_Product_Category.exception.CategoryNotFoundException;
import com.example._thFeb_Product_Category.repo.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repo;

    public Category save(Category c){
        return repo.save(c);
    }

    public List<Category> getAll(){
        return repo.findAll();
    }

    public Category getById(Long id){
        return repo.findById(id)
                .orElseThrow(() ->
                        new CategoryNotFoundException("Category not found"));
    }

	public Page<Category> findAll(PageRequest pageable) {
		// TODO Auto-generated method stub
		return repo.findAll(pageable);
	}


	
}