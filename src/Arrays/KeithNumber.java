package Arrays;

import java.util.Scanner;

public class KeithNumber {
	
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number");
	int num=sc.nextInt();
	
	
	int[] arr=new int[count(num)];
	
	arr=copyDigit(num,arr);
	
	int sum=sumOfArray(arr);
	
	if(sum!=num)
	{
		while(true)
		{
			for(int i=0;i<arr.length-1;i++)
			{
				arr[i]=arr[i+1];
			}
			arr[arr.length-1]=sum;
			sum=sumOfArray(arr);
			
			if (sum==num)
			{
				System.out.println("It is a keith number");
				break;
			}
			else if (sum>num)
			{
				System.out.println("Not a keith number");
				break;
			}
		}
	}
	   
    	else 
         	{
		       System.out.println(" It is a keith number");
	        }
	
	
	
	} 
	
	public static int count(int num)
	{
		int ct=0;
		while (num!=0) 
		{
		  ct++;
		  num/=10;
		}
		return ct;
	}
	
	public static int[] copyDigit(int num,int[]a)
	{
		for(int i=a.length-1;i>=0;i--)
		{
			a[i]=num%10;
			num/=10;
		}
		return a;
		
	}
	public static int sumOfArray(int[]a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		return sum;
	}

}
