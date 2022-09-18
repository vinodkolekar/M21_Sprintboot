package com.cg.springioc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile 
{
	public static void main(String[] args) 
	{
		//Agenda-Spring IOC
		//1. We should not touch the source code
		//2. This application should be configurable
		
		//hard-coding
//		Vi v = new Vi();
//		v.data();
//		
//		Jio j = new Jio();
//		j.calling();
//		j.data();	
		
		ApplicationContext a = new ClassPathXmlApplicationContext("beans.xml");//to provide configuration for your application
		System.out.println("Configuration loaded...");
//		Vi v = (Vi)a.getBean("vi");
//		v.calling();
//		v.data();
//		
//		Jio j = (Jio)a.getBean("jio");
//		j.calling();
//		j.data();
		
		Sim s = a.getBean("sim", Sim.class);
		s.calling();
		s.calling();
	}
}