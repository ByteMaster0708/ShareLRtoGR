
public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1=18;
		int n2=21;
		int low=n1<n2?n1:n2;///7
		
		int hcf=low;//7,6
	    int i=0;//1
		while(true)
		{

			if (n1%hcf==0&&n2%hcf==0) {//7%7==0&&9%7!=0
				System.out.println(hcf);
				break;
			} 
			hcf=low-(i++);//7-1=6
		}
	}

}
