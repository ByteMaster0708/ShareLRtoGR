package Arrays;

import java.util.Scanner;

public class CountRepeatedArraysValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ct=0;
		
		int a[]= {1,1,1,1,1,1,1,1,1,3,4,5,6,7,8,77,77,77,77,77};
		
          Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the key to search:");
		int key=sc.nextInt();
		

		int i;
		for ( i= 0; i < a.length; i++) {
			
			if (a[i]==key) {
	
				ct++;
			}
			
		}
		if (ct==0) {
			System.out.println("Key not found");
			System.exit(i);
		}
		else if (ct==1) {
			System.out.println("Key found only one time");
			System.exit(i);
			
		}
		System.out.println(key+" Value repeated:" +ct+ " Times ");			
		
	
			
		}
		
		
	}

