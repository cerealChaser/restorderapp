package my.edu.utem.ftmk.dad.restorderapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // Declare that this is an entity named "Product"
@Table(name="product") // Assigning the table name to be used for this class
public class Product {
	@Id // Setting this specific attribute to be the primary key
	@GeneratedValue (strategy = GenerationType.IDENTITY) // Auto Increment
	@Column (name = "productid") 	// Assigning column productId to variable productId
	private int productId;
	@Column (name = "name") 		// Assigning column name to variable name
	private String name;
	@Column (name = "price")		// Assigning column price to variable price
	private double price;
	@Column (name = "producttype") 	// Assigning column productType to variable productType
	private int productType;
	
	//Getters and setters for the attributes
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getProductType() {
		return productType;
	}
	public void setProductType(int productType) {
		this.productType = productType;
	}

	
}
