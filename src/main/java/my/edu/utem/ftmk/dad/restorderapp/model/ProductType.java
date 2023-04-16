package my.edu.utem.ftmk.dad.restorderapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity						 //Declare that this is an entity named "ProductType"
@Table (name= "productType") //Assigning the table name to be used for this class
public class ProductType {
	@Id // Setting this specific attribute to be the primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto Increment
	@Column (name = "productTypeId") // Assigning column productTypeId to variable productTypeId
	private int productTypeId;
	@Column (name = "name") // Assigning column name to variable name
	private String name;
	
	// Getters and Setters for the attributes
	public int getProductTypeId() {
		return productTypeId;
	}
	public void setProductTypeId(int productTypeId) {
		this.productTypeId = productTypeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
