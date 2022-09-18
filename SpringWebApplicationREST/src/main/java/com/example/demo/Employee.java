package com.example.demo;
import org.springframework.stereotype.Component;

@Component 
// using component annotation we don't have to use beans.xml file
public class Employee 
{
	private int ID;
	private String Emp_name;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getEmp_name() {
		return Emp_name;
	}
	public void setEmp_name(String emp_name) {
		Emp_name = emp_name;
	}
	
	//constructor
	public Employee()
	{
		System.out.println("Employee details: ");
	}
	 public void print()
	 {
		 System.out.println("IT Department ");
	 }
}