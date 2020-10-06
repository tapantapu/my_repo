package com.tkp.sbrestcrud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tkp.sbrestcrud.model.Product;
import com.tkp.sbrestcrud.service.ProductService;

@RestController
public class ProductController {
	// https://www.codejava.net/frameworks/spring-boot/spring-boot-restful-crud-api-examples-with-mysql-database
	@Autowired
	ProductService service;

	// HealthCheck
	@RequestMapping
	public String healthCheck() {
		return "OK";
	}

	// RESTful API methods for Retrieval operations
	@GetMapping("/products")
	public List<Product> list() {
		return service.listAllProducts();
	}

	// RESTful API method for Create operation
	@PostMapping("/products")
	public void add(@RequestBody Product p) {
		service.save(p);
	}

	// Get information about a specific product based on ID
	@GetMapping("/products/{id}")
	public Product get(@PathVariable Integer id) {
		Product pd = service.get(id);
		return pd;
	}

	/*
	 * In this method, if a product is found for the given ID, the server sends a
	 * response that includes JSON representation of the Product object with HTTP
	 * status OK (200). Else if no product is found, it returns HTTP status Not
	 * Found (404).
	 * 
	 * @GetMapping("/products/{id}") public ResponseEntity<Product>
	 * get(@PathVariable Integer id) {     try {         Product product =
	 * service.get(id);         return new ResponseEntity<Product>(product,
	 * HttpStatus.OK);     } catch (NoSuchElementException e) {         return new
	 * ResponseEntity<Product>(HttpStatus.NOT_FOUND);     }       }
	 */

	// RESTful API method for Update operation
	@PutMapping("/products/{id}")
	public void updateProduct(@RequestBody Product product, @PathVariable Integer id) {

		Product existProduct = service.get(id);
		product.setId(id);
		service.save(product);
	}

	/*
	 * //If a product found with the given ID, it is updated and the server returns
	 * HTTP status OK. If no product found, the HTTP status Not Found (404) is
	 * returned.
	 * 
	 * @PutMapping("/products/{id}") public ResponseEntity<?> update(@RequestBody
	 * Product product, @PathVariable Integer id) { try { Product existProduct =
	 * service.get(id); service.save(product); return new
	 * ResponseEntity<>(HttpStatus.OK); } catch (NoSuchElementException e) { return
	 * new ResponseEntity<>(HttpStatus.NOT_FOUND); } }
	 */

	// RESTful API method for Delete operation
	@DeleteMapping("/products/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}

}
