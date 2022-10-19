package com.exception;

public class Nestedtrycatch {
	 public static void main(String[] args) { 
	    	try
	    	{
	    		int data=50/2; //may throw exception
	    		try{
	    			String s=null;
	    			System.out.println(s.length());
	    		}catch(NullPointerException ae) {
	    			System.out.println(ae);
	    		}
	    		try{
	    			String s1="abc";
	    			int i=Integer.parseInt(s1);
	    		}catch(NumberFormatException ae) {
	    			System.out.println(ae);
	    		}
	    		try {
	    			int a[]=new int[5];  
	    			a[10]=50;
	    		}catch(ArrayIndexOutOfBoundsException ae) {
	    			System.out.println(ae);
	    		}
	    	}catch(ArithmeticException ae) {
	    		System.out.println(ae);
	    	}
	   	}
	    	
}
