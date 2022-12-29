package com.springCore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMain {

	public static void main(String[] args) {

//		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/javaconfig/config.xml");

		ApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);

		Student student = context.getBean("getStudent", Student.class);
		System.out.println(student);

		student.study();
	}
}
