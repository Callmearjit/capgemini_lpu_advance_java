package com.example._thFeb_Product_Category.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationException {
//	@ExceptionHandler(CategoryNotFoundException.class)
//	public String handleException() {
//		return "Category Not Found";
//	}
	
	
	@ExceptionHandler(CategoryNotFoundException.class)
	public ResponseEntity<String> handleException(CategoryNotFoundException ex) {
		return new ResponseEntity<String>(ex.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(ProductNotFoundException.class)
	public String handleException1() {
		return "Product Not Found";
	}
	
	@ExceptionHandler(InvalidProductDataException.class)
	public String  handleException2() {
		return "Invalid Product Data Found";
	}

}
