package com.mkj.gtest.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mkj.gtest.entity.StudentAppUser;
import com.mkj.gtest.service.AppUserService;

@RestController
@RequestMapping("/mybatch")    

public class MyWebController 
{
	@Autowired
	AppUserService userService;
	
	@GetMapping("/welcome")               //localhost:8001/mybatch/welcome
	public String abc()
	{
		return "Hello World";
	}
	/*@GetMapping("/stream/{searchstream}")
	public Student abc4(@PathVariable String searchstream) throws Exception {
		return userService.getStudentsByStream(searchstream);
	}*/
	
	@GetMapping("/users/{name}/{Banglore}")                    //localhost:8001/mybatch/users/name/roll
	public List<StudentAppUser> getAllUsersByNameAndRoll()
	{
		// write some code to extract users
		try 
		{
			List<StudentAppUser>  allExtractedNameAndLocation = userService.getallStudents();
			
			return allExtractedNameAndLocation;
			
		} 
		catch (Exception e) 
		{
			// code missing for expection handling 
			System.out.println(e);
			
		}
		
		return null;
	}
	@PostMapping("/student")
	public String addStudent(@RequestBody StudentAppUser student) 
	{
		 /* request body annotation  , help u 
		 * to take user information as JSON , so it convert JSON object to AppIser Object
		 * */
		try 
		{
			return userService.insertStudent(student);
		} 
		catch (Exception e) 
		{
			return "Contact to customer care 1800-250-960 or mail us :- care@capg.com";
		}
	}
	
	@GetMapping("/users")                    //localhost:8001/mybatch/users
	public List<StudentAppUser> getAllUsers()
	{
		// write some code to extract users
		try 
		{
			List<StudentAppUser>  allExtractedUsers = userService.getallStudents();
			
			return allExtractedUsers;
			
		} 
		catch (Exception e) 
		{
			// code missing for expection handling 
			System.out.println(e);
			
		}
		
		return null;
	}
	@GetMapping("/user/{searchStudentname}")
	public StudentAppUser abc2(@PathVariable String searchStudentname)throws Exception
	{
		return userService.getStudentByName(searchStudentname);
	}
	
	public MyWebController()
	{
		System.out.println("\n\n\n====>> Inside Constructor "+this);
	}
	
	

}