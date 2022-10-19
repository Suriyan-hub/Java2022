package com.customexception;


public class CustomException {

	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub
		validate(-3);
	}

	private static void validate(int age) throws MyException {
		// TODO Auto-generated method stub
		if(age<0) {
			throw new MyException("Invalid Age");
		}
	}

}
