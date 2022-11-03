package Collections;

import java.util.Arrays;
import java.util.Collections;
//import java.util.Comparator;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[]= {100,20,40,70,10,90,-5};
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("Sorted array:" +Arrays.toString(a));
		
	}

}
