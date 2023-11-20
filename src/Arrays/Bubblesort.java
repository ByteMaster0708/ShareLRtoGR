package Arrays;

import java.util.Arrays;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {65432,765432,54,13,765,1,761,45321345};
		
		for (int i = 0; i < a.length-1; i++) {
			
			for (int j = 0; j < a.length-1-i; j++) {
				
				if (a[j]>a[j+1]) {
					
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
		System.out.println("Sorted array is:"+Arrays.toString(a));
	}

}
