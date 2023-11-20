package Basic;

public class Pattern {
	
	/*
	 * public static int Even(int a,int b) { for (int i =a; i <=b; i++) {
	 * 
	 * if (a%2==0) { System.out.println(a);
	 * 
	 * } a++; } return a; }
	 */
	public static void Pattern()
	{
		for (int i =1; i <= 3; i++) 
		{
			for (int j =1; j <=3; j++)
			{
				for (int k = 2; k<=18; k++)
				{
					if (k%2==0) 
					{
						System.out.print(k);
					}
				}
				System.out.println();
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Even(2,18);
		Pattern();
		
		

	}

}
