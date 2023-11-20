package Arrays;

import java.util.Iterator;

public class Unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {11,11,22,45,55,32,54,56,56};
		int ct=0;
		
		for (int i = 0; i < a.length; i++) {
			
		for (int j = 0; j < a.length; j++) {
			
			if (a[i]==a[j]) {
				
				ct++;
			}
			
		}
		if (ct<=1)
		{
			
			System.out.println(a[i]);
		}
		
	}

	}

}
