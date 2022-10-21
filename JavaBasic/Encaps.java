package com.encapsulation;

public class Encaps {
	private String name;
	private int rno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public static void main(String args[]) {
		Encaps e=new Encaps();
		e.setName("Dilsha");
		e.setRno(5);
		System.out.println("Name:" +e.getName());
		System.out.println("Roll No :"+e.getRno());
	}
}
