package com.java8;

interface Multistmt{  
    String print(String message);  
}  
public class Sample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multistmt m=(message)->{
					String str="Hello How are you? ";
					String str1=str+message;
					return str1;
		};
		System.out.println(m.print("I am doing fine."));
	}

}
