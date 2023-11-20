
public class LCM1 {

	public static void main(String[] args) {
		
		int n1=18;
		int n2=21;
		int low=n1<n2?n1:n2;///7
		
		int hfc=low;//7,6
	    int i=0;//1
		while(true)
		{

			if (n1%hfc==0&&n2%hfc==0) {//7%7==0&&9%7!=0
				System.out.println(hfc);
				break;
			} 
			hfc=low-(i++);//7-1=6
		}
	}

}
