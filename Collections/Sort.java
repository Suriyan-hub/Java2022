package Collections;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {50,10,75,15,90,2};
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Sorted Array:");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
