package Basic;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=10;
		for (int i = 1; i<=n; i++) {
			
			for (int j =1; j<=2*n-1; j++) 
			{
		
				if (j>=n-(i-1)&&j<=n+(i-1))
				{
					System.out.print("* ");
				} 
				else
				{
					System.out.print(" ");
				}
				System.out.println();
			}
			
			
		}
	}

}
