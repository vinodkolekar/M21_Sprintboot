package com.cg.di;

public class Student 
{
	private int id;
	private String StudentName;
	
	//constructor injection
	public Student(int id, String studentName) {
		super();
		this.id = id;
		StudentName = studentName;
	}
	
	//using setters injection
//	public void setId(int id) {
//		this.id = id;
//	}
//	public void setStudentName(String studentName) {
//		StudentName = studentName;
//	}

	public void display()
	{
		System.out.println("Name of the student is: " +StudentName +" "+ "and id is: " +id);
	}
}