package Collections;

import java.util.TreeSet;

public class Tree1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts=new TreeSet<>();
		ts.add("Arun");
		ts.add("Vini");
		ts.add("Jeneifer");
		ts.add("Zeba");
		ts.add("Vini");
		ts.remove("Vini");
		System.out.println(ts);
	}

}
