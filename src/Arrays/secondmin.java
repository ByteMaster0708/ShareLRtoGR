package Arrays;

public class secondmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {100,400,500,600,200};
		
		int min=Integer.MAX_VALUE;
		int secmin=Integer.MIN_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i]<min) {
				
				secmin=min;
				min=a[i];
			}
			else if (a[i]<secmin&&a[i]!=min) {
				
				secmin=a[i];
			}
		}
		System.out.println(secmin);
	}

}
