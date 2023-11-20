package Arrays;

import java.util.Arrays;

public class PrintReverseOfSameArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a= {1,3,4,5,6};
		
		int [] b=new int[a.length];
		
		
		for (int i =0; i<b.length;i++) {///i=4;4>0
			
				for (int j =  b.length-1; j <b.length; j--) {//j=0;0<5,j=1;1<5
					
					b[j]=a[i];//6,
				

				}

				
			}
		
		System.out.println(Arrays.toString(b));
	}

}
