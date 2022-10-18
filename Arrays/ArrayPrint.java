package com.array;
import java.util.Scanner;

	public class ArrayPrint {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int i;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of values in an array");
			int n=sc.nextInt(); 
			int a[]=new int[n];
			System.out.println("Enter the array values");
			for(i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
				
			}
			System.out.println("Values in an array are:");
			for(i=0;i<n;i++)
			{
				System.out.println(a[i]);
			}
			
		}

}
