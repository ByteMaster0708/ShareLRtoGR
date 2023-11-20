package Arrays;

import java.util.Arrays;

public class ArrangeArrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,-1,0,4,-3,-8,-9};
		
		int index=0;
		
		boolean pos=false;
		boolean neg=false;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]>=0 && pos==false &&neg==false) {
				
				index=i;
				pos=true;
			}
			else if (a[i]<0 && pos==true && neg==false) {
				
				int temp =a[index];
				
				a[index]=a[i];
				
				a[i]=temp;
				
				i=index;
				pos=neg=false;
				
			} 
		}
		System.out.println(Arrays.toString(a));
	}

}
