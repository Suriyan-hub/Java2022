package com.referncetypecasting;

public class Student extends Person {
	   public String branch;
	   public int Student_id;
	   public Student(String name, int age, String branch, int Student_id){
	      super(name, age);
	      this.branch = branch;
	      this.Student_id = Student_id;
	   }
	   public void displayStudent() {
	      System.out.println("Name: "+this.name);
	      System.out.println("Age: "+this.age);
	      System.out.println("Branch: "+this.branch);
	      System.out.println("Student ID: "+this.Student_id);
	   }
	   public static void main(String[] args) {
		   //Converting sub class variable to super class type
		   Student student = new Student("Krish", 20, "IT", 1256);
		   Person person = new Person("Krish", 20);
		   person = (Student) student;
		   person.displayPerson();
		}
}