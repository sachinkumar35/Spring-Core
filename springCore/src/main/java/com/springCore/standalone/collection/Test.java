package com.springCore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springCore/standalone/collection/aloneconfig.xml");
		Person person1 = (Person) con.getBean("person1");
		System.out.println(person1);
		System.out.println(person1.getFriends().getClass().getName());
		System.out.println("_____________________________________________________");
		System.out.println(person1.getFeestructure());
		System.out.println(person1.getFeestructure().getClass().getName());
		System.out.println("_____________________________________________________");
		System.out.println(person1.getProperties());
		System.out.println(person1.getProperties().getClass().getName());
	}

}
