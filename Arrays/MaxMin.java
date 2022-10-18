package com.array;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,3,4,5,6};
		int f=0;
		int l=a.length-1;
		int n=a.length;
		int b1[]=new int[n];
		boolean b=true;
		for(int i=0;i<n;i++)
		{
			if(b) {
				b1[i]=a[l];
				l--;
			}else {
				b1[i]=a[f];
				f++;
			}
			b=!b;
			
		}
		for(int i=0;i<b1.length;i++)
		{
			System.out.print(b1[i]+" ");
		}
	}

}
