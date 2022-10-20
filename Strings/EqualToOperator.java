package com.strings;

public class EqualToOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("Hello");
		String s1=new String("Hello");
		String s2="Java";
		String s3="Java";
		System.out.println("String created using new keywords");
		//validating with string reference
		System.out.println(s==s1);
		//equals method
		//System.out.println(s.equals(s1));
		System.out.println("String created using string literals");
		System.out.println(s2==s3);
	}

}
