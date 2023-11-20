package Arrays;

import java.util.Arrays;

public class DuplicateReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a= {1,2,3,4,5,6};
		
		int b[]=new int [a.length];

		
		
		for (int i = 0,j=b.length-1; i < b.length;j--, i++) {
			
			b[j]=a[i];
			
		}
		
		System.out.println(Arrays.toString(b));
		
	}

}
