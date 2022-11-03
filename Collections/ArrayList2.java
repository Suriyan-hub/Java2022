package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> al=new ArrayList<>();
		al.add(1);
		al.add("Apple");
		al.add('a');
		al.add(12.5);
		al.add(50);
		al.add("Guava");
		al.add(null);
		al.add(null);
		System.out.println(al);
		
		al.remove(3);
		System.out.println(al);
		al.set(1, "Banana");
		System.out.println(al);
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
