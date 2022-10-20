package com.strings;

public class Countchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Welcome Java"; 
		int count = 0;
		for(int i=0;i<s.length();i++)
		{ 
			if(s.charAt(i)!= ' ') 
			{
					count++; 
			}

		} 
		System.out.println(count); 
		}

}


