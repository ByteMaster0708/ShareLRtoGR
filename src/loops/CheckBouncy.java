package loops;

import java.util.Scanner;
public class CheckBouncy {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=s.nextInt();//13689
		boolean pos=false;//true
		boolean neg=false;//true
		
		int rem1=num%10;//9
		num/=10;//1368
		int rem2=num%10;//8
		num/=10;//136
		
		if (rem1>rem2) //9>8
		{
			pos=true;//true
		}
		else if(rem2>rem1)//9<8
		{
			neg=true;//true
		}
			
		if (neg&&pos) //true&&true
		{
			System.out.println("Bouncy number");	
		} 
		else
		{
			System.out.println("Not Bouncy number");
		}

		}
		
		

}
