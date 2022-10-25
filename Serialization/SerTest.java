package com.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Car c=new Car("Silver",2500000,"Hyundai");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Suriya Stephen\\Documents\\Java Programs\\car.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(c);
		System.out.println("done");
		
	}

}
