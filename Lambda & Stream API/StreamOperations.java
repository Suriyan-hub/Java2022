package com.java8;

import java.util.Arrays;
import java.util.List;

public class StreamOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> values=Arrays.asList(11,4,22,9,44,75);
		System.out.println(values.stream()
								 .filter(StreamOperations::filterval)
								 .map(StreamOperations::doubleval)
								 .findFirst()
								 .orElse(0));
	}
    public static boolean filterval(int i) {
    	System.out.println("Filter value:" +i);
    		return i%2==0;
    	}
    public static int doubleval(int i) {
    	System.out.println("Double value:" +i);
    	return i*2;
    }
    }

