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

import my.edu.utem.ftmk.dad.restorderapp.model.ProductType;
import my.edu.utem.ftmk.dad.restorderapp.repository.ProductTypeRepository;

//The Controller class to control all the REST functions for "Product Type"
//@Rest to enable the REST functions set within Spring
//@RequestMapping to access to the API
@RestController
@RequestMapping ("/api/ordertypes")
public class ProductTypeRESTController {
	// Wiring for "Product" Repository
	@Autowired
	private ProductTypeRepository productTypeRepository;
	
	// Select@Query data from "ProductType" table 
	@GetMapping
	public List<ProductType> getProductTypes(){
		return productTypeRepository.findAll();
	}
	
	// Insert data into "ProductType" table
	@PostMapping()
	public ProductType insertProductType(@RequestBody ProductType productType) {
		return productTypeRepository.save(productType);
	}
	
	// Update data in "ProductType" table
	@PutMapping()
	public ProductType updateProductType(@RequestBody ProductType productType) {
		return productTypeRepository.save(productType);
	}
	
	// Delete data from "ProductType" table
	@DeleteMapping()
	public ResponseEntity<HttpStatus> deleteProductType(@PathVariable long productTypeId){
		productTypeRepository.deleteById(productTypeId);
		// Will return "ok" if the deletion is successful
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
