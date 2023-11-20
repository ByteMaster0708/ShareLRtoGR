package Basic;

public class CheckArmstrong {
	
	
	public static int count(int a)
	{
	    int ct=0;
		while (a>0) {
			ct++;
			a/=10;
		}
		return ct;
	}
	
	
//	public static int power(int base,int raise)
//	{
//		int power=1;
//		for (int i =1; i<=raise; i++) {//3
//			power=power*base;
//		}
//		return power;
//	}
	
	public static int Powersum(int a)//23
	{
		int sum=0;
		while (a>0) {
			int power=1;
			int rem=a%10;//3 
			for (int i =1; i<=count(a); i++) {
				power=power*rem;
			}
		sum=sum+power;
		a/=10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=407;
		int sum1=Powersum(num);
		
		if (num==sum1) {
			System.out.println("Armstrong");
		} else 
		{
        System.out.println("Not Armstrong");
		}

	}

}
