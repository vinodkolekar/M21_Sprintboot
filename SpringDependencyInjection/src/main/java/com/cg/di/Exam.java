package com.cg.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) 
	{
//		There are 3 types of dependency:
//			1. Dependency in the form of Literals
//			2. Dependency in the form of objects
//			3. Dependency in the form of collections
		
//		Dependencies injection: The data initialization depends on another classes that we are going to inject using spring framework
		
//		Dependencies injection can be achieved in two ways:
//		1.using setter method
//		2. using constructor
		
		//hard coding
//		Student s = new Student();
//		s.setStudentName("Shabnam");
		
		ApplicationContext a = new ClassPathXmlApplicationContext("beans.xml");
		Student s = a.getBean("s",Student.class);
		System.out.println("Configuration loaded...");
		s.display();
	}
}