package Basic;

public class PatternJava {

	public static void main(String[] args) {
		
		for (int i = 1; i <=4; i++) {
			
		for (int j = 1; j <=i; j++) {
			
			if (i==1&&j==1)
			{
				System.out.print(j);
			} 
			if ((i==2&&j>0)||(i==4&&j>0))
			{
				System.out.print("*"+" ");
			} 
			if (i==3&&j>0) 
			{
				System.out.print(j+1+" ");
			}
		}
		System.out.println();
			
		}

	}

}
