package Collections;

import java.util.*;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 List<Integer> li=new ArrayList<>();
 li.add(10);
 li.add(20);
 li.add(30);
 li.add(40);
 li.add(50);
 for(int i=0;i<li.size();i++)
 {
	 System.out.println("List elements are:"+li.get(i));
 }
 li.add(2, 1000);
 li.set(0, 500);
 li.remove(0);
 
 for(Integer i:li)
 {
	 System.out.println("List elements usig foreach are:"+i); 
 }
 li.remove(Integer.valueOf(30));
 Iterator<Integer> it=li.iterator();
 while(it.hasNext())
 {
	 System.out.println("List elements usig Iterator are:"+it.next()); 

 }
 List<String> list=new ArrayList<>();
 list.add("Anu");
 list.add("Priya");
 list.add("Tarun");
 list.add("Kiran");
 list.add("Hari");
 
 list.remove("Tarun");
 System.out.println(list);
 System.out.println(list.contains("Sindhu"));
	}

}
