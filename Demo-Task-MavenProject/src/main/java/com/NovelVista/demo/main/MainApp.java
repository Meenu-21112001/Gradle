package com.NovelVista.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.NovelVista.demo.entity.Kid;



public class MainApp 
{
	public static void main(String[] args)
	{
		
		ApplicationContext spring=new ClassPathXmlApplicationContext("kid-spring-cfg.xml");
		Kid k=spring.getBean("kid",Kid.class);
		System.out.println(k);
		System.out.println(k.getName());
		System.out.println(k.getParent());
		System.out.println("parents name"+k.getParent().getFatherName()+"-----"+k.getParent().getMotherName());
		
	}
	

}
