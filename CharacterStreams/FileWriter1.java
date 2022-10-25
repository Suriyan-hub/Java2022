package com.characterstream;


import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = null;
			try {
					fw=new FileWriter("C://Users//Suriya Stephen//Documents//Java Programs//filewritedoc.txt");
					String s="Welcome to Java";
					try {
						fw.write(s);
						fw.flush();
						System.out.println("done");
						} 
					catch (IOException e) {
						System.out.println("Exception while writing");
					}
				} catch (FileNotFoundException e) {
					System.out.println("File is not available");
				}
				
			finally {
			try 
			{
				if(fw!=null)
				fw.close();
			} 
			catch (IOException e) {
				System.out.println("Exception while closing");
			}
		  }
	
	}
	}
