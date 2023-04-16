package my.edu.utem.ftmk.dad.restorderapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.edu.utem.ftmk.dad.restorderapp.model.Product;
import my.edu.utem.ftmk.dad.restorderapp.repository.ProductRepository;

//The Controller class to control all the REST functions for "Product"
//@Rest to enable the REST functions set within Spring
//@RequestMapping to access to the API
@RestController
@RequestMapping("/api/ordertypes")
public class ProductRESTController {
	// Wiring for "Product" Repository
	@Autowired
	private ProductRepository productRepository;
	
	// Select@Query data from "Product" table 
	@GetMapping
	public List<Product> getProduct(){
		return productRepository.findAll();
	}
	
	// Insert data into "Product" table 
	@PostMapping()
	public Product insertProduct(@RequestBody Product product) {
		return productRepository.save(product);
	}
	
	// Update data in "Product" table 
	@PutMapping()
	public Product updateProduct(@RequestBody Product product) {
		return productRepository.save(product);
	}
	
	// Delete data from "Product" table
	@DeleteMapping("{productId}")
	public ResponseEntity<HttpStatus> deleteProduct(@PathVariable long productId){
		productRepository.deleteById(productId);
		// Will return "ok" if the deletion is successful
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
