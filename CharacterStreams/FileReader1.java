package com.characterstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileReader fr=null;
		try {
			 fr=new FileReader("C://Users//Suriya Stephen//Documents//Java Programs//filereaddoc.txt");
			try {
				int data=fr.read();
				 while(data!=-1)
				 {
					 
					 System.out.print((char)data);
					 data=fr.read();
				 }
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Exception while reading");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
		}
		finally
		{
			try 
		{
			if(fr!=null)
			fr.close();
		} catch (IOException e) {
			System.out.println("Exception while closing");
		}
		}
		}
		
	}


