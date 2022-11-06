package com.mkj.gtest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="productInfo")
public class ProductInfomation
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int certificateNumber;
	private String countryOfOrgin;
	private String manufacturingDate;
	private int weight;
	private String color;
	public ProductInfomation(String countryOfOrgin, String manufacturingDate, int weight, String color) {
		super();
		this.countryOfOrgin = countryOfOrgin;
		this.manufacturingDate = manufacturingDate;
		this.weight = weight;
		this.color = color;
	}
	
	
}
