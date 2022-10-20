package com.strings;

public class StringBuffer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("hello");
		StringBuffer sb1=new StringBuffer("Welcome");
		System.out.println(sb);
		System.out.println("Appending words");
		sb.append(" world");
		System.out.println(sb);
		System.out.println("Insert a word");
		sb.insert(2, "java");
		System.out.println(sb);
		System.out.println("Replace words");
		sb.replace(2, 4, "sqlsql");
		System.out.println(sb);
		System.out.println("Delete Words");
		sb.delete(5,9);
		System.out.println(sb);
		System.out.println("Substring " +sb1.substring(2, 6));
		System.out.println("Substring with only start index " +sb1.substring(1));
		System.out.println("Reverse a String");
		sb.reverse();
		System.out.println(sb);
		
	}

}
