package com.variables;

public class StaticVariable {
	
	static String college="interns";
	int stu_id;
	public static void main(String[] args)
	{
		StaticVariable s=new StaticVariable(); 
		s.stu_id=1;
		System.out.println(s.stu_id+" "+college);
	}
}


