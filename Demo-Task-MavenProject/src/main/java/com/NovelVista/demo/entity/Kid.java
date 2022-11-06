package com.NovelVista.demo.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Kid 
{
	@Value("meenu")
	private String name;
	@Value("1")
	private int age;
	@Value("female")
	private String gender;
	
	@Autowired
	private Parent parent;

	public Kid(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
}
