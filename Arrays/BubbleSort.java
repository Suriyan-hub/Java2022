package com.array;

public class BubbleSort {
	public static void main(String[] args) {
		int a[]=new int[] {10,30,50,20,60};
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length-1;j++){
				if(a[i]>a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+" ");
		}
	}
}


