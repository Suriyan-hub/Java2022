package com.java8;

import java.util.Arrays;
import java.util.List;

public class Sample3 {

	
	public static void main(String[] args) {
		List<Integer> values=Arrays.asList(1,2,3,4,5,6);
		Sample3 s=new Sample3();
		
		values.forEach(i->System.out.println(i));
		values.forEach(System.out::println);
		values.forEach(i->doubleVal(i));
		values.forEach(Sample3::doubleVal);
		values.forEach((i)->s.message(i));
		values.forEach(s::message);
	}
	public static void doubleVal(int i) {
		System.out.println(i*2);
	}
	public void message(int i) {
		System.out.println(i+100);
	}
}
