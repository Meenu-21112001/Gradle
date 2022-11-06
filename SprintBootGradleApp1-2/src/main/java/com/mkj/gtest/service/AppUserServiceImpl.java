package com.mkj.gtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mkj.gtest.dao.AppUserDao;
import com.mkj.gtest.entity.StudentAppUser;


@Service
public class AppUserServiceImpl implements AppUserService{

	
	@Autowired
	   AppUserDao dao;

	@Override
	public List<StudentAppUser> getallStudents() throws Exception {
		// TODO Auto-generated method stub
		return dao.getallStudents();
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
	public StudentAppUser getStudentByName(String studentName) throws Exception {
		// TODO Auto-generated method stub
		return dao.getStudentByName(studentName);
	}

	@Override
	public StudentAppUser getStudentByRollno(int rollNumber) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentAppUser getStudentByNameandLocation(String studentName, String role) throws Exception {
		// TODO Auto-generated method stub
		return dao.getStudentByNameandLocation(studentName, role);
	}

	@Override
	public String insertStudent(StudentAppUser student) throws Exception {
		// TODO Auto-generated method stub
		return dao.insertStudent(student);
	}
		
}
