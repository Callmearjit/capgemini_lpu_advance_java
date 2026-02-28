package com.example._thFeb_Product_Category.exception;

public class CategoryNotFoundException extends RuntimeException {

    public CategoryNotFoundException(String msg){
        super(msg);
    }
}