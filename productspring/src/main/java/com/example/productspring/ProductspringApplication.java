package com.example.productspring;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ProductspringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ProductspringApplication.class, args);
		ProductService service = context.getBean(ProductService.class);
		
		List<Product> products = service.getAllProducts();
		for(Product p : products) {
		
		System.out.println(p);
		}
////		
		System.out.println("====================================================");
//		
		System.out.println("A particular Product");
		
		Product product = service.getProduct("Apple Mouse");
		System.out.println(product);
        
//        List<Product> list = service.getProductWithText("Black");
//        for(Product p : list) {
////    		
//    		System.out.println(p);
//    		}
		
		
	}

}
