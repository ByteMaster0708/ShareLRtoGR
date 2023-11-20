package Basic;

public class Secondmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,34,56,78,90,23,45,54};
		
		int max=Integer.MIN_VALUE;
		int secmax=Integer.MAX_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a.length; j++) {
				
				if (a[i]>max) {
					
					secmax=max;
					max=a[i];
				}
				else if (a[i]>secmax && a[i]!=max) {
					
					secmax=a[i];
				}
			}
		}
		System.out.println(secmax);
	}

}
