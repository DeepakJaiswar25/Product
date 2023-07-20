package com.deepak.productrest.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deepak.productrest.Entity.Product;
import com.deepak.productrest.dao.ProductDB;

@Service
public class ProductService {

	@Autowired
	ProductDB db;
	
	public List<Product> getAllProduct(){
		
	   List<Product> list = db.findAll();
		
	   return list;
	}

	public Optional<Product> getProduct(int id) {
		
		
		return db.findById(id);
	}
	
	
	public void addProduct(Product p) {
		
		db.save(p);
	}

	public void deleteProduct(int id) {

		db.deleteById(id);
	}
}
