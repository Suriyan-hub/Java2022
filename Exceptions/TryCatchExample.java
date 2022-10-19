package com.exception;

public class TryCatchExample {
	    public static void main(String[] args) { 
	    	try
	    	{
	    		//int data=50/0; //may throw exception
	    		//String s=null;
	    		//System.out.println(s.length());
	    		//String s1="abc";
	    		//int i=Integer.parseInt(s1);
	    		int a[]=new int[5];  
	    		a[10]=50;

	    	}
	    	catch(ArithmeticException ae){
	    		System.out.println(ae);
	    	}
	    	catch(NullPointerException ae){
	    		System.out.println(ae);
	    	}
	    	catch(NumberFormatException ae){
	    		System.out.println(ae);
	    	}
	    	catch (Exception e) {
				System.out.println(e);
			}
	    	
	        System.out.println("rest of the code");  
	      }  
	      
	}  


