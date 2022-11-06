package Capg.demo.MavenProject.entity;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student 
{
	@Value("22")
	private int rollNumber;
	@Value("Mahesh")
	private String name;
	@Value("${marks}")   // this is how to pick the value from property file
	private int marks;
	
	@Autowired
	private Subject subject;
	
	public Student(int rollNumber, String name, int marks)
{
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.marks = marks;
	
	
}
}

