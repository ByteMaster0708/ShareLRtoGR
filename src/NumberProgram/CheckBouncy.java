package NumberProgram;
import java.util.Scanner;
public class CheckBouncy {

	public static void main(String[] args) {
            
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter your number:");
			int num=sc.nextInt();//76
			
			
			boolean pos=false;
			boolean neg=false;
			
			int ld=num%10;
			num/=10;
			
			int ld1=num%10;
			num/=10;
			
			
			if(ld>ld1)
			{
				pos=true;
			
			} 
			if(ld1>ld)
			{
				neg=true;
			}
			if (pos||neg) {
				System.out.println("Bouncy");
				
			} else {
				System.out.println("Not Bouncy");

			}
		}
	}

}
