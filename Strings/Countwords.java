package com.strings;

public class Countwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hai how are you";
		int count=1;
		for (int i=0;i<s.length();i++) {
			if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' ')){
				count++;
			}
		}
		System.out.println("No of words are:"+count);
	}

}
