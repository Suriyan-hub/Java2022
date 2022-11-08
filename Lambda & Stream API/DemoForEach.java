package com.java8;

import java.util.Arrays;
import java.util.List;

public class DemoForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li=Arrays.asList(20,5,10,6,10);
		System.out.println("Iterating values using for loop:");
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
		System.out.println("Iterating values using for-each loop:");
		for(int i:li) {
			System.out.println(i);
		}
		System.out.println("Iterating values using lambda expression:");
		li.forEach(i -> System.out.println(i));
	}
}

