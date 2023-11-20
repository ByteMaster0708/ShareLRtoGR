package oops;

public class AccountDriver {
	
	public static void main(String[]args)
	{
		Account a1= new Account("prem", 1234567891, "SBI", "kop", "SBI4167", "Saving", 1234, 100000.00);
		System.out.println(a1.getbalance(1234,1234567891));
		a1.withdraw(1234567891,1234,1234);
	}

}
