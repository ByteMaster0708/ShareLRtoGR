package Basic;
import java.util.Scanner;
public class Froghopes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total distance in meter:");
		double distance=sc.nextDouble();
		int hopes=25;
	    double totaldistanceincm=distance*100;
	   double Numberofhopes=totaldistanceincm/hopes;
	
		System.out.println("Total number hops required for the frog to travel from A to B is:"+Numberofhopes);
	}

}
