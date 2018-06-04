package com.stream;

import java.io.Serializable;

public class Product implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int price;
	private String name;
	public Product(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public int getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Product [price=" + price + ", name=" + name + "]";
	}
	
	

}
