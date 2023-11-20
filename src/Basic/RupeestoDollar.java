package Basic;
import java.util.Scanner;
public class RupeestoDollar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Currency in INR:");
		double INR=sc.nextDouble();
		
		double Dollar=INR/82.84;
		
		System.out.println(+INR+"RS IN dollar is:"+Dollar+"$");
	}

}
