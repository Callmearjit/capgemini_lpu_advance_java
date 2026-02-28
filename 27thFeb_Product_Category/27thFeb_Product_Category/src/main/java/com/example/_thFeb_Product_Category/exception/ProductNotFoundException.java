package com.example._thFeb_Product_Category.exception;

public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException(String msg){
        super(msg);
    }
}

