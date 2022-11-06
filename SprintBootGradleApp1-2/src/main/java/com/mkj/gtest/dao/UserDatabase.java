package com.mkj.gtest.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.mkj.gtest.entity.StudentAppUser;



@Component
public class UserDatabase {

	public List<StudentAppUser> allUsers = new ArrayList<>();
	
	 UserDatabase()
	 {
		
		 System.out.println(" inside user database");
		 
		StudentAppUser user1 = new StudentAppUser("Meenu", "A11", 90, "IT","Banglore");
		StudentAppUser user2 = new StudentAppUser("Lachu", "A11", 70, "IT","Coimbatore");
		StudentAppUser user3 = new StudentAppUser("Annam", "A11", 80, "IT","Chennai");
		allUsers.add(user1);
		allUsers.add(user2);
		allUsers.add(user3);
		

		
	}

	public List<StudentAppUser> getAllUsers() 
	{
		return allUsers;
	}

	public void setAllUsers(List<StudentAppUser> allUsers) {
		this.allUsers = allUsers;
	}

	public StudentAppUser getStudentByName(String name) 
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	
}