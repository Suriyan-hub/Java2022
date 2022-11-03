package Collections;

import java.util.*;


public class Stack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> fruits=new Stack<>();
		fruits.push("Apple");
		fruits.push("Banana");
		fruits.push("Mango");
		fruits.push("Kiwi");
		fruits.push("Grapes");
		fruits.push("Pomogranate");
		System.out.println(fruits);
		System.out.println(fruits.peek());
		System.out.println(fruits.pop());
		System.out.println(fruits.peek());
	}

}
