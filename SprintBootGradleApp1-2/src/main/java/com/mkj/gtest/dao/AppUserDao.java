package com.mkj.gtest.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mkj.gtest.entity.StudentAppUser;


@Repository
public interface AppUserDao
{
	List<StudentAppUser> getallStudents()throws Exception;
	List<StudentAppUser> getStudentsByStream()throws Exception;
	List<StudentAppUser> getStudentsByMarks()throws Exception;
	StudentAppUser getStudentByMarks(int r1, int r2)throws Exception;
	StudentAppUser getStudentByName(String name)throws Exception;
	StudentAppUser getStudentByNameandLocation(String studentName,String role)throws Exception;
	StudentAppUser getStudentByRollno(int rollNumber)throws Exception;
	String insertStudent(StudentAppUser student)throws Exception;
	
     StudentAppUser getStudentbystreamandlocation(String stream,String location)throws Exception;
	
 
}
