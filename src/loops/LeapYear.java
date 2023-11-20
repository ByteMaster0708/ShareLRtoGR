package loops;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Year:");
		int Year=s.nextInt();
		
		   if ((Year%4==0&&Year%100!=0)||(Year%400==0)) 
	     {
			   System.out.println("This is leap year:"+Year);
		} 
		  else
		 {
			   System.out.println("This is not leap year:"+Year);			   

		}
			
			
		}

	}


