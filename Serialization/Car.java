package com.serialization;

import java.io.Serializable;

public class Car implements Serializable {
	private static final long serialVersionUID=2L;
	private String color;
	private int price;
	private String brand;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Car() {
		System.out.println("Car is created");
	}
	public Car(String color,int price,String brand) {
		super();
		this.color=color;
		this.price=price;
		this.brand=brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [color=" + color + ", price=" + price + ", brand=" + brand + "]";
	}

	
	
}
