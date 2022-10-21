package com.hasA;

public class Car {
	private String color; 
    private int maxSpeed; 
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
  
