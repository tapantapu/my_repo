package com.tkp.sbrestcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tkp.sbrestcrud.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	 
}
