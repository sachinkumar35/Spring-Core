package com.springCore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
//	here now we are using AbstractApplicationContext interface instead of ApplicationContext
//	Because we want to use destroy method using registerShutdownHook
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/lifecycle/config.xml");
		
	//	registering shutdown hook
		context.registerShutdownHook();
		Samosa s1 = (Samosa)context.getBean("s1");
		System.out.println(s1);

		

		Pepsi p1 = (Pepsi)context.getBean("p1");
		System.out.println(p1);
		
		
		//FOR EXAMPLE CLASS
		Example example = (Example) context.getBean("example");
		System.out.println(example);
		
	}
}
