package Arrays;
import java.util.Arrays;
public class CreateDuplicateArrayOfSameArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int []a= {1,3,4,6,8,76,3,32};
		
		int [] b=new int[a.length];
		
		
		for (int i = 0; i < a.length; i++) {
			
				b[i]=a[i];
			}
		System.out.println("This is for A Array:"+Arrays.toString(a));
		System.out.println("This is for B Array:"+Arrays.toString(b));

	}

}
