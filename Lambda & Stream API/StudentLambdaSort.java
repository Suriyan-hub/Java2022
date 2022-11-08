package com.java8;

import java.util.*;

public class StudentLambdaSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list=new ArrayList<Student>();  
        
        //Adding Products  
        list.add(new Student(1,"Arjun",'A'));  
        list.add(new Student(3,"Keerthi",'C'));  
        list.add(new Student(2,"Diya",'B'));  
        list.add(new Student(5,"Jisha",'A'));  
        list.add(new Student(4,"Sathya",'C'));  
        
        System.out.println("Sorting on the basis of name");
        
        Collections.sort(list,(s1,s2)->{  
            return s1.name.compareTo(s2.name);  
            });  
            for(Student s:list){  
                System.out.println(s.rno+" "+s.name+" "+s.grade);
            }  
            
	}

}
