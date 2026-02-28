package com.example._thFeb_Product_Category.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example._thFeb_Product_Category.Entity.Category;
import com.example._thFeb_Product_Category.Entity.Product;
import com.example._thFeb_Product_Category.exception.CategoryNotFoundException;
import com.example._thFeb_Product_Category.repo.CategoryRepository;
import com.example._thFeb_Product_Category.repo.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepo;

    @Autowired
    private CategoryRepository categoryRepo;

    public Product addProduct(Long categoryId,
                              Product product){

        Category category = categoryRepo.findById(categoryId)
                .orElseThrow(() ->
                        new CategoryNotFoundException("Category not found"));

        product.setCategory(category);

        return productRepo.save(product);
    }

    public List<Product> getProductsByCategory(Long categoryId){
        return productRepo
                .findByCategoryCategoryId(categoryId);
    }

    public List<Product> search(String name){
        return productRepo
                .findByProductNameContaining(name);
    }
}