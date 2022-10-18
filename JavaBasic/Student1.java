package com.referncetypecasting;

public class Student1 extends Person1 {
	public String branch;
	   public int Student_id;
	   public Student1(String name, int age, String branch, int Student_id){
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
		 //Converting the object of person to student
		   Person person = new Student("Krishna", 20, "IT", 1256);
		   
		   Student student = (Student) person;
		   student.displayPerson();
		  student.displayStudent();
		}
}
