package com.array;

import java.util.Scanner;

	public class LargestNo {
		public static void main(String[] args) {
			int temp=0;
			System.out.println("enter limit");
			Scanner ee=new Scanner(System.in);
			int n=ee.nextInt();
			int b[]=new int[n];
			System.out.println("Enter the values");
			
			for(int i=0;i<b.length;i++)
			{
				b[i]=ee.nextInt();
				if(b[i]>temp)
				{
					temp=b[i];
				}
			}
			System.out.println("Largest No in array"+temp);
		}
}

