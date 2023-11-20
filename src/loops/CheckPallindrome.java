package loops;
import java.util.Scanner;
public class CheckPallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=s.nextInt();
         int temp=num;
		int rev=0;
		while (num>0) {
			
			rev=rev*10+num%10;
			num/=10;
		}
		if (rev==temp) {
			System.out.println("Pallindrome");
			
		} else {
			System.out.println("Not Pallindrome");

		}

	}

}
