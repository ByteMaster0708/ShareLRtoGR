package Basic;

public class Prime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       
		int ct2=0;
		
		for (int i = 1; i <=1000; i++) {
			int ct=0;
			
			for (int j =1; j <=i; j++) {
				
				if (i%j==0) {
					
					ct++;
					
				}
				
			}
			if (ct==2) {
				ct2++;
				ct=0;
			}
			
		}
		System.out.println(ct2);
		
	}
	
}


