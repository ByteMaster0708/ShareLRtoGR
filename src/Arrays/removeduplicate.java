package Arrays;

import java.util.Arrays;

public class removeduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,4,4,4,5,5,6,6,7,7,};
		
		int rd=0;
		int temp=0;
		
		for (int i = 1; i < a.length; i++) {
			
			if (a[rd] != a[i]) {
				
				rd++;
				
				a[rd]=a[i];		
			}
		}
		
		
		for (int i = 0; i < rd; i++) {
			
			System.out.println(Arrays.toString(a));	
		}
		
	}

}
