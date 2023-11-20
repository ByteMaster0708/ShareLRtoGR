package Basic;

public class Extract {

	public static void main(String[] args) {
		
		String a="Abefghi@23";
		
		for (int i =0;i<=a.length(); i++) {
			
               if( (a.charAt(i)>=65&& a.charAt(i)<=90)||(a.charAt(i)>=97&&a.charAt(i)<=122))
               {
				System.out.print(a.charAt(i));  
			   } 
		}
			
		}
		
	}
