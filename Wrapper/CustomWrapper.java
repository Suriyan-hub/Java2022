package com.wrapperclasses;

class Custom{  
		private int i;  
		Custom(){}  
		Custom(int i){  
		this.i=i;  
		}  
		public int getValue(){  
		return i;  
		}  
		public void setValue(int i){  
		this.i=i;  
		}  
		@Override  
		public String toString() {  
		  return Integer.toString(i);  
		}  
	}  
		
	public class CustomWrapper {  
		public static void main(String[] args){  
		Custom c=new Custom(10);  
		System.out.println(c);  
		}
	}  

