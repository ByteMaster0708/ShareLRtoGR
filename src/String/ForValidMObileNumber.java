package String;

import java.util.Scanner;

public class ForValidMObileNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your Mobile Number in String: ");
		String s=sc.next();
		
		if ((s.length()==10 )&& (s.charAt(0)>='9' ||  s.charAt(0)<='6')) {
			
			int j;
			
		for ( j = 0; j < s.length(); j++) {
			
			if (!(s.charAt(j)>='0') && (s.charAt(9)<='9')) {
				
				break;
			}
		}
		
		if (j==s.length()) {
			System.out.println("It is valid phno number");
		}
		else {
			System.out.println("It is Not valid phno number");
		}
			
			
		}
		
		else
		{
			System.out.println("It is not valid phno number");
		}
		
		
		

	}

}
