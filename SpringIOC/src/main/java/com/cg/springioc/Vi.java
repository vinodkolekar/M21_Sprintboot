package com.cg.springioc;

public class Vi implements Sim
{
	public Vi()
	{
		super();
		System.out.println("Constructor-Vi");		
	}
	
	public void calling() 
	{
		System.out.println("Callig using Vi Sim");		
	}

	public void data() 
	{
		System.out.println("Browsing using Vi Sim");		
	}
}