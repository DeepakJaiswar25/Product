package com.deepak.productrest.Service;

import java.util.List;

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
}
