package com.deepak.productrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deepak.productrest.Entity.Product;
import com.deepak.productrest.Service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService service;
	
	@GetMapping("/product")
	public List<Product> getAllProducts(){
		
		 List<Product> list = service.getAllProduct();		
		 
		 return list;
	}
}
