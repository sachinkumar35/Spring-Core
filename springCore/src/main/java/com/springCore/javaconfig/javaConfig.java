package com.springCore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
					//@ComponentScan(basePackages = "com.springCore.javaconfig")
public class javaConfig {
	
	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
	
	@Bean
	public Student getStudent() {
		// creating a new student object
		Student student = new Student(getSamosa());
		return student;
	}
}
