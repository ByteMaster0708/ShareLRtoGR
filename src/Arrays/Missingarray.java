

package Arrays;

import java.util.Scanner;

public class Missingarray {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a size of array");
		
		int size=sc.nextInt();
		
		int a[]=new int [size];
		
		System.out.println("enter elements in array");
		
		for (int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();////1,2,4,5,6
		}
		
		int expected_ele=a.length+1;//6
		int total_sum=expected_ele*(expected_ele+1)/2;//6(6+1)/2=
		
		int sum=0;//0
		for(int i=0;i<a.length;i++)//
		{
			sum+=a[i];//
		}
		System.out.println("Missing elementis :"+(total_sum-sum));
	}

}
