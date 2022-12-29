package com.springCore.javaconfig;

import org.springframework.stereotype.Component;

//@Component("firstStudent") // now we are removing this annotation also, we used in javaConfig class to declare bean


public class Student {
	
	private Samosa samosa; // this is called dependency

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}
	
	public Samosa getSamosa() {
		return samosa;
	}


	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}


	public void study() {
		this.samosa.display();
		System.out.println("Student is reading book...!");
	}
}
