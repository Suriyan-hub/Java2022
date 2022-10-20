package com.strings;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Welcome";
		char a[]=s.toCharArray();
		System.out.println(s);
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]);
		}
	}
}
