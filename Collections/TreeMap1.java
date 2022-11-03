package Collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> tmap=new TreeMap<>();
		tmap.put(1, "Hari");
		tmap.put(4, "Irene");
		tmap.put(2, "Asim");
		tmap.put(0, "Sruthi");
		tmap.put(3, "Grace");
		tmap.put(5, null);
		tmap.put(7, "Yasim");
		System.out.println(tmap.containsKey(0));
		System.out.println(tmap.containsValue("Grace"));
		System.out.println(tmap);
		
	}

}
