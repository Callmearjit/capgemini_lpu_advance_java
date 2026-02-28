package com.example._thFeb_Product_Category.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example._thFeb_Product_Category.Entity.Product;
import com.example._thFeb_Product_Category.service.ProductService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/category/{categoryId}")
    public Product addProduct(
            @PathVariable Long categoryId,
            @RequestBody Product product){

        return service.addProduct(categoryId, product);
    }

    @GetMapping("/category/{categoryId}")
    public List<Product> getProducts(
            @PathVariable Long categoryId){

        return service.getProductsByCategory(categoryId);
    }

    @GetMapping("/search")
    public List<Product> search(
            @RequestParam String name){

        return service.search(name);
    }
}
