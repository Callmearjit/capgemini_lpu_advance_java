package com.example._thFeb_Product_Category.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example._thFeb_Product_Category.Entity.Category;
import com.example._thFeb_Product_Category.exception.CategoryNotFoundException;
import com.example._thFeb_Product_Category.service.CategoryService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService service;

    @PostMapping
    public Category create(@RequestBody Category c){
        return service.save(c);
    }

    @PostMapping("/categories/{page}/{size}")
    public Page<Category> getCategory(@PathVariable int page,@PathVariable int size) {
    	Page<Category> p = service.findAll(PageRequest.of(page, size));
    	return  (Page<Category>) p.getContent();
    }   
    
    @GetMapping
    public ResponseEntity<Category> getByTd(@PathVariable int id){
    	Optional<Category> optional=Optional.of(service.getById((long) id));
    	Category c=null;
    	if(optional.isPresent()) {
    		c=optional.get();
    		return new ResponseEntity<Category>(c,HttpStatus.FOUND);
    	}
    	else {
    		//return new ResponseEntity<Category>(c,HttpStatus.NOT_FOUND);
    		throw new CategoryNotFoundException("Category Not Found Id:"+id); 
    	}
    }

    @GetMapping
    public List<Category> all(){
        return service.getAll();
    }
    
    
}
