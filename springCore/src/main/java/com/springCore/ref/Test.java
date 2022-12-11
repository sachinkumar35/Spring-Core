package com.springCore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/ref/refconfig.xml");
		A temp = (A) context.getBean("aref");
		
		System.out.println(temp.getX());
		System.out.println(temp.getOb().getY());

		System.out.println(temp);
		
		
		A temp2 = (A) context.getBean("aref2");
		System.out.println(temp2.getX());
		System.out.println(temp2.getOb().getY());

	}
}
