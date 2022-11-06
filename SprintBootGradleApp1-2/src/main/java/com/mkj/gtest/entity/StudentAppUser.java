package com.mkj.gtest.entity;

import org.springframework.stereotype.Component;

@Component
public class StudentAppUser 
{
	private String studentName;
	private String rollNumber;
	private int marks;
	private String stream;
	private String location;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public StudentAppUser() {
		super();
	}
	public StudentAppUser(String studentName, String rollNumber, int marks, String stream, String location) {
		super();
		this.studentName = studentName;
		this.rollNumber = rollNumber;
		this.marks = marks;
		this.stream = stream;
		this.location = location;
	}
	@Override
	public String toString() {
		return "StudentAppUser [studentName=" + studentName + ", rollNumber=" + rollNumber + ", marks=" + marks
				+ ", stream=" + stream + ", location=" + location + "]";
	}
	
		

}
