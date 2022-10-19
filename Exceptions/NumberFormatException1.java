package com.exception;

public class NumberFormatException1 {
    public static void main(String args[]) {
    	try {
    	String s="xyz";
    	int i=Integer.parseInt(s);
       }
    	catch(NumberFormatException ae) {
    		System.out.println(ae);
    	}
    	System.out.println("Done");
    } 
}
