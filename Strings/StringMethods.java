package com.strings;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello World";
		String s2="Java";
		System.out.println("Character at specified Index "+s.charAt(3));
		System.out.println("Concatenating String "+s.concat(" Java"));
		System.out.println("Index of the specified character "+s.indexOf('l'));
		System.out.println("string starts with :" +s.startsWith("Hel"));
		System.out.println("String ends with :" +s.endsWith("rld"));
		System.out.println("String Length :" +s.length());
		String s1=s.intern();
		System.out.println("Intern String :" +(s==s1));
		System.out.println("String is empty :"+s.isEmpty());
		System.out.println("Last Index :" +s.lastIndexOf('d'));
		System.out.println("Last Index of string :" +s.lastIndexOf("World"));
		System.out.println("Trim :" +s2.trim());
		System.out.println("Upper case :" +s.toUpperCase());
		System.out.println("Lower Case :" +s.toLowerCase());
	}

}
