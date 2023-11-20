package Arrays;

import java.util.Arrays;
import java.util.Iterator;

public class ClockwiseRotationBy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []a= {1,2,3,4,5,6};
		int temp1[]= {1,2,3,4,5,6};
		
		int temp=a[0];
		
		for (int i = 1; i < a.length; i++) {
			
			a[i-1]=a[i];
		}
		
		a[a.length-1]=temp;
		System.out.println("Original Array : "+Arrays.toString(temp1));
		System.out.println("Shifted by one to left Array : "+Arrays.toString(a));

	}

}
