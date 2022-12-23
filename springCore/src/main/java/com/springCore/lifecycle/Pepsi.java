package com.springCore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

// Here we are implementing InitializingBean and DisposableBean to use init and destroy method
public class Pepsi implements InitializingBean,DisposableBean {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	
	@Override
	public void afterPropertiesSet() throws Exception { // it will work same as INIT Method
		//init
		System.out.println("------>Taking Pepsi: init");
		
	}

	@Override
	public void destroy() throws Exception {
		// destroy
		System.out.println("------>Going to put bottle back to shop: destroy");
		
	}
	
	
}
