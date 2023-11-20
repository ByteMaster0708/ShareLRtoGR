import java .util.Scanner;
public class LCM {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n1 value n1:");//3
		int n1=sc.nextInt();//3
		System.out.println("Enter the n1 value n2:");
		int n2=sc.nextInt();//5

		int large=n1>n2?n1:n2;//5
		int i=1;//1,2,3
		int lcm=large;//10,15
		while (true) 
		{
			if (lcm%n1==0&&lcm%n2==0) {//5%3!=0
				System.out.println("The LCM of "+n1+"And"+n2+"is:"+lcm);
				break;
		}
		lcm=large*i++;//5*2,5*3,
		}
		
		
	}

}
