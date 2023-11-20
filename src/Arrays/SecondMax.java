package Arrays;

public class SecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {100,200,300,500,400};
		
		int  max=Integer.MIN_VALUE;
		int secmax=Integer.MAX_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i]>max)
			{
				
				secmax=max;
				max=a[i];
			}

			else if (a[i]>secmax&&a[i]!=max) {
				secmax=a[i];
			}
		}
		System.out.println(secmax);

	}

}
