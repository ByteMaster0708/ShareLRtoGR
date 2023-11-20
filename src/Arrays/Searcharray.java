package Arrays;

import java.util.Scanner;

public class Searcharray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a= {34,5678,5435,322,23,46,23,45,232,231};
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the key to search:");
		int key=sc.nextInt();
		
		int i;
		
		for (i = 0; i < a.length; i++) {
			
			if (key==a[i]) {
				
				System.out.println("Key found: "+a[i] +" at: " +i+ "th Index");
				break;
			}
			
		}
		if (i>=a.length) {
			System.out.println("key not found "+key);
			
		}
		
		

	}
	
}


