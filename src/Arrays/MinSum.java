package Arrays;

import java.util.Iterator;
import java.util.Scanner;

public class MinSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter value to make sum:");
	    int sum=sc.nextInt();
	    
	    int a[]= {12,15,3,18,21,2,23};
	    
	    for (int i = 0; i < args.length; i++) {
			
	       for (int j = 0; j < args.length; j++) {
			
	    	   if (a[i]+a[j]==sum) {
				
	    		   System.out.println(a[i]+","+a[j]);
			}
	    	   else {
				System.out.println("Sum not found");
			}
		}
		}

	}

}
