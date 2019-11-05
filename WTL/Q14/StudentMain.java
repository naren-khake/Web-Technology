package com.Q14;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Student student = context.getBean("student",Student.class);
		
		System.out.println(student);
		
		//context.close();
		
		
	}
}
