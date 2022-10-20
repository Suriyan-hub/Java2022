package com.strings;

public class Comparison {

	public static void main(String[] args) {
			//equal case
			String s1="hello";
			String s2="Hello";
			String s3="java";
			System.out.println("Equals Methods");
			System.out.println(s1.equals(s2));
			System.out.println(s1.equals(s3));
			System.out.println(s2.equals(s3));

			//equal ignore case
			String s4="Hello";
			String s5="hello";
			String s6="java";
			System.out.println("Equal Ignore Case");
			System.out.println(s4.equalsIgnoreCase(s5));
			System.out.println(s5.equalsIgnoreCase(s6));
			System.out.println(s4.equalsIgnoreCase(s6));

			//Compare to
			String s10="Java";
			String s11="java";
			String s12="Java";
			System.out.println("Compare to");
			System.out.println(s10.compareTo(s11));
			System.out.println(s10.compareTo(s12));
			System.out.println(s11.compareTo(s12));
			System.out.println(s12.compareTo(s11));
	}

	}


