package Arrays;

public class FindminArray {

	public static void main(String[] args) {
		
		int []a= {0,3,4,5,6,7,8,900};
		
		int min=Integer.MAX_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i]<min) {
				min=a[i];
				
			}
		}
		
		System.out.println(min);

	}

}
