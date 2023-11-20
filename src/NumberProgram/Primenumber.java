package NumberProgram;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=12;
		int ct=0;
		
		for (int i = 0; i < num; i++) {
			
			if (num%2==0) {
				
				ct++;
				
			} 
			
		}
		if (ct==2) {
			
			System.out.println("It's prime number");
		} 
		else {
			System.out.println("It's not prime number");
		}
	}

}
