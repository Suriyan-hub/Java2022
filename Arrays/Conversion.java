package com.array;

public class Conversion {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int a[]= {20,30,40,50,60};
			float b[]={20.3f,30.4f,40.5f,50.6f,60.7f};
			int i;
			String s=" ";
			String s1=" ";
			System.out.println("Integer to String Values in an array are:");
			for(i=0;i<a.length;i++)
			{
			    s=String.valueOf(a[i]);
			    System.out.print(s+ " " + 10);
			   
			}
			System.out.println();
			System.out.println("Float to String values in an array are:");
			for(i=0;i<a.length;i++)
			{
			    s1=String.valueOf(b[i]);
				System.out.print(s1+" ");
			}

		}
}
