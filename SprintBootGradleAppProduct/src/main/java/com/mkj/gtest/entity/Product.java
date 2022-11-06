package com.mkj.gtest.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="product")
public class Product 
{ 
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int productCode;
	

	private String category;
	private String productName;
	private int price;
	private String dealerName;
	private float userRating;
	public Product getProductByProductName(String productName2) {
		// TODO Auto-generated method stub
		return null;
	}
	public Product linkProduct(ProductInfomation productInfo, Product alreadySavedProduct) {
		// TODO Auto-generated method stub
		return null;
	}
	public void setProductInformation(ProductInfomation productInfo) {
		// TODO Auto-generated method stub
		
	}

	
}
