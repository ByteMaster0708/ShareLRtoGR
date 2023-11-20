package Arrays;

import java.util.Iterator;

public class Primecount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {3,7,11,4,6,37,79};
		
		int ct2=0;
		
		for (int i = 0; i < a.length; i++)// 
		{
			int ct=0;
	       for (int j = 1; j <= a[i]; j++)///1<13
	       {
	    		
	    	   if (a[i]%j==0) //13%1==0
	    	   {
				
					ct++;
				}
		   }
	       if (ct==2)
			{
				ct2++;
				ct=0;
		
			}
			
		}
		System.out.println(ct2);
		
	}
	
}
			
		




