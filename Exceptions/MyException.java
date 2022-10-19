package com.customexception;

public class MyException extends Exception {
	public MyException(){}
	
	public MyException(String message){
		super(message);
	}
	
}
