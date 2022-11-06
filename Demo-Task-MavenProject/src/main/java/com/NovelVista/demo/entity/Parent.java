package com.NovelVista.demo.entity;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Parent
{
	@Value("${parent.fatherName}")
	private String fatherName;
	@Value("${parent.motherName}")
	private String motherName;
	
	
	
	@Value("${parent.grandFatherName}")
	private String grandFatherName;
	@Value("${parent.Demo-AppgrandMotherName}")
	private String grandMotherName;
	
	
	
}