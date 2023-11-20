package Basic;
import java.util.Scanner;
class Prime 
    {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Starting number:");
		int start=s.nextInt();
		System.out.println("Enter the ending number:");
		int end=s.nextInt();
		int ct=0;
		
		for (int i = start; start<=end; i++) {
			
			for (int j =1;j<=start; j++) {
				
				if (start%j==0) {
					ct++;
				}
				
			}
			if (ct==2) {
				
				System.out.println(start);

			}
			else
			{
				ct=0;
			}
		}
			
		}
}
