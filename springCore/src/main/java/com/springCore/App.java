package com.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student student1 = (Student) context.getBean("student1");
        Student student2 = (Student) context.getBean("student2");
        Student student3 = (Student) context.getBean("student3");

    
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        
//    	Student obj =  new Student();
//    	obj.setStudentId(100);
//    	System.out.println(obj.getStudentId());
//    	obj.setStudentId(101);
//    	System.out.println(obj.getStudentId());
        
    }
}
