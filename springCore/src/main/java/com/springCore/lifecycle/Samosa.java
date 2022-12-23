package com.springCore.lifecycle;

public class Samosa {
	private Double price;

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		System.out.println("==== Setting Price Property");
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	
	public void init()
	{
		System.out.println("====== Inside Init Method");
	}
	
	public void destroy()
	{
		System.out.println("====== Inside Destroy Method");
	}
	
}
