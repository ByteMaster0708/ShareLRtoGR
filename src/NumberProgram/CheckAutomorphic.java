package NumberProgram;
import java.util.Scanner;
public class CheckAutomorphic {

	public static void main(String[] args) {
            
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number:");
		int num=sc.nextInt();//76
		int temp=num;
		int temp1=num;
		int temp2=num;
		
		int sqr=num*num;//76*76//5776
	
		int ct=0;
		while (temp1>0) {
			 temp1/=10;
			 ct++;
		}
		int revnum=0;//6
		for (int i =1; i<=ct; i++)
		{
			revnum=revnum*10+sqr%10;//0*10+6=6,6*10+7
			sqr/=10;//577,
		}
		int revnum2=0;
		for (int j=1; j <= ct; j++) {
			
			revnum2=revnum2*10+revnum%10;
			revnum/=10;
		}
		
		if (temp==revnum2)
		{
			System.out.println("Automorphic number");
		} 
		
		else 
		{
			System.out.println("Not Automorphic number");
		}
		
		
		
	}

}
