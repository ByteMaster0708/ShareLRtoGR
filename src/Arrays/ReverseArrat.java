package Arrays;

import java.util.Arrays;

public class ReverseArrat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []a= {1,3,4,5,6};
		
		int i=0,j=a.length-1;
		
	while (i<j) {
		
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		i++;
		j--;
	}
	System.out.println(Arrays.toString(a));

	}

}
