package com.springCore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
//	@Autowired
	private Address address;

	public Address getAddress() {
		return address;
	}

//	@Autowired
	public void setAddress(Address address) {
		this.address = address; 
		System.out.println("INSIDE SETTER METHOD...!");
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("INSIDE CONSTRUCTOR...!");
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	
	
}
