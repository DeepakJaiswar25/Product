package com.deepak.productrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deepak.productrest.Entity.Product;

@Repository
public interface ProductDB extends JpaRepository<Product, Integer> {

}
