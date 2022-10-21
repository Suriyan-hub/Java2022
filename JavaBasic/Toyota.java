package com.hasA;

public class Toyota extends Car{
	public void ToyotaStartDemo() 
    { 
        Engine ToyotaEngine = new Engine(); 
        ToyotaEngine.start(); 
        ToyotaEngine.stop(); 
    } 
	public static void main(String[] args) 
    { 
        Toyota t = new Toyota(); 
        t.setColor("Silver"); 
        t.setMaxSpeed(429); 
        t.carInfo(); 
        t.ToyotaStartDemo();
        
    } 
}
