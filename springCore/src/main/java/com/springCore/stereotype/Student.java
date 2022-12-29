package com.springCore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // for this annotation the name of class should be same to use in test class
//@Component("object") // for this annotation the object name is 'object' to use in test class
@Scope("prototype")
public class Student {
	
	@Value("Sachin Bhardwaj")
	private String studentName;
	@Value("Mathura")
	private String city;
	
	@Value("#{temp}")     	// #{temp} it will take the values from config file "Standalone List"
	private List<String> address;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}
	
	
}
 