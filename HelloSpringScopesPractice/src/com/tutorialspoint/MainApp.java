package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;;

public class MainApp {
	
	public static void main(String[]args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld objA = (HelloWorld) context.getBean("HelloWorld");
		
		objA.setMessage("I'm object A");
		objA.getMessage();
		
		HelloWorld objB = (HelloWorld) context.getBean("HelloWorld");
		//objB.setMessage("I'm object B");
		objB.getMessage();
	}

}
