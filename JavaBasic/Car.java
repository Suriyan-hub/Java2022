package com.hasA;

public class Car {
	private String color; 
    private int maxSpeed; 
  
    public static void main(String[] args) 
    { 
        Car nano = new Car(); 
        nano.setColor("Silver"); 
        nano.setMaxSpeed(429); 
        nano.carInfo(); 
        Toyota t = new Toyota(); 
        t.ToyotaStartDemo(); 
    } 
    public void setMaxSpeed(int maxSpeed) 
    { 
        this.maxSpeed = maxSpeed; 
    } 
    public void setColor(String color) 
    { 
       this.color = color; 
    } 
    
    public void carInfo() 
    { 
        System.out.println("Car Color= " + color 
                           + " Max Speed= " + maxSpeed); 
    } 
} 
  
