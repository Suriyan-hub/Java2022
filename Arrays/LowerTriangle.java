package com.array;
import java.util.Scanner;
public class LowerTriangle {
	public static void main(String[] args) {
	System.out.println("Enter no of rows:");
	Scanner sc=new Scanner(System.in);
	int n1=sc.nextInt();
	System.out.println("Enter the no of columns:");
	int n2=sc.nextInt();
	int a[][]=new int[n1][n2];
	
	System.out.println("Enter the elements:");
	for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n2;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
	if(n1!=n2) {
		System.out.println("Matrix should be square matrix");
	}else {
	for(int i=0;i<n1;i++)
	{
		for(int j=0;j<n2;j++)
		{
			if(j>i){
					System.out.print("0 ");
				}else{
					System.out.print(a[i][j]+ " ");
				}
		}
		System.out.println();
	}
  }
}
}