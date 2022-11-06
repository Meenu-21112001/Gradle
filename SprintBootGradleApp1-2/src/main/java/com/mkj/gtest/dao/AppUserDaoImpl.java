package com.mkj.gtest.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mkj.gtest.entity.StudentAppUser;

@Repository

public class AppUserDaoImpl implements AppUserDao
{
	@Autowired
	UserDatabase db;

	@Override
	public List<StudentAppUser> getallStudents() throws Exception
	{
		// TODO Auto-generated method stub
		return db.getAllUsers();
	}

	@Override
	public List<StudentAppUser> getStudentsByStream() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentAppUser> getStudentsByMarks() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentAppUser getStudentByMarks(int r1, int r2) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentAppUser getStudentByRollno(int rollNumber) throws Exception {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public StudentAppUser getStudentByNameandLocation(String studentName, String location) throws Exception {
		List<StudentAppUser> allUsers = getallStudents();
		
		 StudentAppUser student = allUsers.stream().filter((u)->{
			if(u.getStudentName().equals(studentName)&&u.getLocation().equals(location))
			{
				return true;
			}
			else return false;
		}).findFirst().get();
		 
		// System.out.println("User"+allUsers);
		return student;	
	}

	@Override
	public StudentAppUser getStudentByName(String name) throws Exception {
		// TODO Auto-generated method stub
		return db.getStudentByName(name);
	}

	@Override
	public String insertStudent(StudentAppUser student) throws Exception 
	{
		
			// TODO Auto-generated method stub
			 List<StudentAppUser> list =   db.getAllUsers();
			 list.add(student);
			 db.setAllUsers(list); // adding the new user in the previous list
			 return "its Done";
		}

	@Override
	public StudentAppUser getStudentbystreamandlocation(String stream, String location) throws Exception {
		// TODO Auto-generated method stub
		return db.getStudentByName(location);
	}
		
	}

	