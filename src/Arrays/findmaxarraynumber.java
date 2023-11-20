package Arrays;

public class findmaxarraynumber {

	public static void main(String[] args) {
	
		
		int []a= {100,200,300,400,500,600};
		
		int max=Integer.MIN_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]>max) {
				
				max=a[i];
				
			}
		}
		System.out.println(max);

	}

}
