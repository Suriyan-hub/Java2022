package com.bytestream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		try {
			 fos=new FileOutputStream("C://Users//Suriya Stephen//Documents//Java Programs//filewritedoc.txt");
			String s="Apple is a fruit!!!";
			try {
				System.out.println("bytes:" +s.getBytes());
				fos.write(s.getBytes());
				fos.flush();
				System.out.println("done");
			} catch (IOException e) {
				System.out.println("Exception while writing");
			}
		} catch (FileNotFoundException e) {
			System.out.println("File is not available");
		}
		finally {
				try {
						if(fos!=null)
						fos.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						System.out.println("Exception while Closing");
					}
		
		}
	}

}
