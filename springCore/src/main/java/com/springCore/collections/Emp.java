package com.springCore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Emp {
	private String name;
	private List<String> phones;
	private List<String> addresses;
	private Map<String, String> courses;
	private Properties props;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public List<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	
	
	public Emp(String name, List<String> phones, List<String> addresses, Map<String, String> courses,
			Properties props) {
		super();
		this.name = name;
		this.phones = phones;
		this.addresses = addresses;
		this.courses = courses;
		this.props = props;
	}
	
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}


}
