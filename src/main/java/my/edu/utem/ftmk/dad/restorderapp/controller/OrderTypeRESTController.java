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

import my.edu.utem.ftmk.dad.restorderapp.model.OrderType;
import my.edu.utem.ftmk.dad.restorderapp.repository.OrderTypeRepository;

// The Controller class to control all the REST functions for "OrderType"
// @Rest to enable the REST functions set within Spring
// @RequestMapping to access to the API
@RestController
@RequestMapping ("/api/ordertypes")
public class OrderTypeRESTController {
	// Wiring for "Order Type" Repository
	@Autowired
	private OrderTypeRepository orderTypeRepository;
	
	// Select @ Query data from "Order Type" table
	@GetMapping
	public List<OrderType> getOrderTypes(){
		return orderTypeRepository.findAll();
	}
	
	// Insert new data to "Order Type" table
	@PostMapping
	public OrderType insertOrderType(@RequestBody OrderType orderType) {
		return orderTypeRepository.save(orderType);
	}
	// Update data to "Order Type" table
	@PutMapping()
	public OrderType updateOrderType(@RequestBody OrderType orderType) {
		return orderTypeRepository.save(orderType);
	}
	
	// Delete data from "Order Type" table using OrderTypeID
	@DeleteMapping("{orderTypeId}")
	public ResponseEntity<HttpStatus> deleteOrderType(@PathVariable long orderTypeId){
		orderTypeRepository.deleteById(orderTypeId);
		// Will return "ok" if the deletion is successful
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
