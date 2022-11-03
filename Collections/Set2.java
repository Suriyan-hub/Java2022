package Collections;

import java.util.HashSet;
import java.util.Set;

public class Set2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s1=new HashSet<>();
		s1.add(100);
		s1.add(50);
		s1.add(300);
		s1.add(200);
		s1.add(100);
		s1.add(null);
		s1.add(null);
		System.out.println(s1);
	}

}
