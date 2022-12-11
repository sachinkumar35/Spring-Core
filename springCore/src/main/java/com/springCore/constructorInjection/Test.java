package com.springCore.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/constructorInjection/ciconfig.xml");
		Person p = (Person)context.getBean("person");
		System.out.println(p);
		
		System.out.println("\n-------------------------------\n");
		
		Person p1 = (Person)context.getBean("person1");
		System.out.println(p1);
		
//	FOR ADDITION CLASS
		System.out.println("\n--------------------------------\n");
		Addition add= (Addition) context.getBean("add");
		add.doSum();
		System.out.println("\n--------------------------------\n");
		Addition add1= (Addition) context.getBean("add1");
		add1.doSum();
	}

}
