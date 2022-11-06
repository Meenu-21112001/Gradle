package com.mkj.gtest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mkj.gtest.entity.StudentAppUser;

@Service
public interface AppUserService {
	List<StudentAppUser> getallStudents()throws Exception;
	List<StudentAppUser> getStudentsByStream()throws Exception;
	List<StudentAppUser> getStudentsByMarks()throws Exception;
	StudentAppUser getStudentByMarks(int r1, int r2)throws Exception;
	StudentAppUser getStudentByName(String studentName)throws Exception;
	StudentAppUser getStudentByNameandLocation(String studentName,String role)throws Exception;
	StudentAppUser getStudentByRollno(int rollNumber)throws Exception;
	String insertStudent(StudentAppUser student)throws Exception;
}
