package com.deepak.productrest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/product/{id}")
	public Optional<Product> getProduct(@PathVariable int id){
		
        return service.getProduct(id);		
		 
		 
	}
	
	
	@PostMapping("/product")
	public void addProduct(@RequestBody Product p) {
		
		service.addProduct(p);
	}
	@DeleteMapping("/product/{id}")
	public void deleteProduct(@PathVariable int id) {
		
		service.deleteProduct(id);
	}
	
	@PutMapping("/product")
	public void updateProduct(@RequestBody Product p) {
		service.updateProduct(p);
	}
}
