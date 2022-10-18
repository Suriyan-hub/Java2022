package com.array;

import java.util.Scanner;

	public class ArrayElementEven {
		public static void main(String[] args) {
			int f=0;
			System.out.println("enter the limit");
			Scanner bff=new Scanner(System.in);
			int n=bff.nextInt();
			int b[]=new int[n];
			System.out.println("Enter the values");
			for(int i=0;i<b.length;i++){
				b[i]=bff.nextInt();
			}
			for(int i=0;i<b.length;i++) {
				if(b[i]%2==0){
					f++;
				}
				if(f>0) {
					System.out.println(b[i]+"is even");
				}else{
					System.out.println(b[i]+"is odd");
				}
				f=0;
			}
			
		}
}

