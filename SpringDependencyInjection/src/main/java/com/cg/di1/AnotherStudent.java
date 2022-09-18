package com.cg.di1;

public class AnotherStudent 
{
//	Cheat c;
	//di using constructor
//	public AnotherStudent(Cheat c) {
//		super();
//		this.c = c;
//		System.out.println("Microxerox is ready in constructor of AnotherStudent class");
//	}
	
	Cheat c;
	public void setC(Cheat c) {
		this.c = c;
	}


	public void cheating()
	{
		c.mathcheat();
	}
}