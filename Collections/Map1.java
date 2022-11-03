package Collections;

import java.util.HashMap;
import java.util.Map;

public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> m=new HashMap<>();
		m.put(1,"Archana");
		m.put(2, "Gleena");
		m.put(3, "Rahul");
		m.put(6, "Bini");
		m.put(5, "Chippi");
		m.put(4, "zeena");
		m.put(7, null);
		m.put(0, null);
		m.put(0, "Sithara");
		System.out.println(m.containsValue("zeena"));
		System.out.println(m.isEmpty());
		m.remove(6);
		for(Integer k:m.keySet()) {
			System.out.println(k);
		}
		for(String s:m.values()) {
			System.out.println(s);
		}
		System.out.println(m);
		
	}

}
