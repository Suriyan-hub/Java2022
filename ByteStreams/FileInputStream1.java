package com.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream1 {

	public static void main(String[] args) {
		FileInputStream fis=null;
     try {
		fis=new FileInputStream("C://Users//Suriya Stephen//Documents//Java Programs//filereaddoc.txt");
		try {
			int data=fis.read();
			//System.out.println("data:" +data);
			while(data!=-1) {
				//System.out.println("data:" +data);
				System.out.print((char)data);
				data=fis.read();
			}
		} catch (IOException e) {
			System.out.println("Exception while reading");
		}
	} catch (FileNotFoundException e) {
		System.out.println("file is not available");
	}
 finally {
	 try
	 {			
	 if(fis!=null) 
		 	fis.close();
	 }
	 catch (Exception e) {
		System.out.println("Exception while Closing");
	}

	}

}
}