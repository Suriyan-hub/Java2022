package com.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeseriTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("C:\\Users\\Suriya Stephen\\Documents\\Java Programs\\car.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Car c1=(Car)ois.readObject();
		System.out.println(c1);
	}

}
