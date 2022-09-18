package com.cg.di1;

public class Student1 
{
//	Cheat c = new Cheat();
//	public void cheating()
//	{
//		c.mathcheat();
//	}
	
	//dependency in the form of objects
	Cheat c;
	public void setC(Cheat c) 
	{
		this.c = c;
	}
	public void cheating()
	{
		c.mathcheat();
	}
}