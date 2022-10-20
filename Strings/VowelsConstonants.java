package com.strings;

public class VowelsConstonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vow=0,con=0;
		String s="apple is a fruit";
		for(int i=0;i<s.length();i++)
		{
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||
				s.charAt(i)=='u'){
				vow++; 
		}
		else if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{ 

				con++; 
			} 
		}
		System.out.println("Number of vowels: " + vow); 
		System.out.println("Number of consonants: " + con); 
		}
   }


