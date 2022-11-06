package com.mkj.gtest.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int productCode;
	
	
	private String category;
	private String productName;
	private int price ;
	private String dealerName;
	private float userRating;
	
	
	public Product(String category, String productName, int price, String dealerName, float userRating) {
		super();
		this.category = category;
		this.productName = productName;
		this.price = price;
		this.dealerName = dealerName;
		this.userRating = userRating;
	}	
	
	
	
}