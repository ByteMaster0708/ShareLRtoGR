package Basic;

public class SwastikPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for (int i = 1; i <=9; i++) {
			
			for (int j = 1; j <=9; j++) {
				
				if (i==1&&j>=5||i==5&&j>0||i==9&&j<=5||j==1&&i<=5||j==5&&i>0||j==9&&i>=5) {
					
					System.out.print("*"+" ");
					
				} else {
					System.out.print(" "+" ");

				}
				
			}
			System.out.println( );
			
		}

	}

}
