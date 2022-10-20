package com.strings;

public class ReplaceVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="fruit world";
		System.out.println(s);
		for(int i=0;i<=s.length()-1;i++) 
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||
					s.charAt(i)=='u'){
						System.out.print("*");
				}
				else {
						System.out.print(s.charAt(i));
				}
		}
	}
}


