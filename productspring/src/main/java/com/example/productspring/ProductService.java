package com.example.productspring;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService {

	List<Product> products= new ArrayList<Product>();
	
	@Autowired
	ProducDB db;
//	public void addProduct(Product p) {
//		
//		db.addProduct(p);
//		
//	}
	
	
	public List<Product> getAllProducts(){
		
//		List<Product> list = db.findAll();
		return db.findAll();
	}
	
	public Product getProduct(String item) {
		
//		Product prod = db.findByName(item);
		
		return db.findByName(item);
	
	}
//	
//	public List<Product> getProductWithText(String text){
//		
//		String str=text.toLowerCase();
//		List<Product> prods =new ArrayList<Product>();
//
//		for(Product p :products) {
//			
//			String name=p.getName().toLowerCase();
//			String type=p.getType().toLowerCase();
//			String place =p.getPlace().toLowerCase();
//			
//			if(name.contains(str) || type.contains(str) || place.contains(str)) {
//				prods.add(p);
//			}
//			
//		}
//		return prods;
//		
//	}
//	
//public List<Product> getProductWithPlace(String text){
//		
//		String str=text.toLowerCase();
//		List<Product> prods =new ArrayList<Product>();
//
//		for(Product p :products) {
//			
//		
//			if(p.getPlace().equals(text)) {
//				prods.add(p);
//			}
//			
//		}
//		return prods;
//		
//	}
//
//public List<Product> CheckWarranty(){
//	
////	String str=text.toLowerCase();
//	List<Product> prods =new ArrayList<Product>();
//
//	for(Product p :products) {
//		
//	
//		if(p.getWarranty()<2023) {
//			prods.add(p);
//		}
//		
//	}
//	return prods;
//	
//}
}
