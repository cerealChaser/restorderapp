package my.edu.utem.ftmk.dad.restorderapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 					//Declare that this is an entity named "OrderType"
@Table(name = "ordertype")	//Assigning the table name to be used for this class
public class OrderType {	// This class is to retrieve data from database into the application
	@Id						// Setting this specific attribute to be the primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto Increment
	@Column (name="orderTypeId")  // Assigning column orderTypeId to variable orderTypeId
	private int orderTypeId;
	@Column (name="code")		  // Assigning column code to variable code
	private String code;
	@Column (name="name")		  // Assigning column name to variable name
	private String name;
	
	//Getters and Setters
	public int getOrderTypeId() {
		return orderTypeId;
	}
	public void setOrderTypeId(int orderTypeId) {
		this.orderTypeId = orderTypeId;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
