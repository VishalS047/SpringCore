package com.springcore.springcore;

public class Student 
{
	private int Studentid;
	private String StudentName;
	private String studentAddress;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentid, String studentName, String studentAddress) {
		super();
		Studentid = studentid;
		StudentName = studentName;
		this.studentAddress = studentAddress;
	}
	@Override
	public String toString() {
		return "Student [Studentid=" + Studentid + ", StudentName=" + StudentName + ", studentAddress=" + studentAddress
				+ "]";
	}
	public int getStudentid() {
		return Studentid;
	}
	public void setStudentid(int studentid) {
		Studentid = studentid;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	
}
