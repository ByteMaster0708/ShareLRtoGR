package oops;

public class Account {
	
	private String user;
	private long accno;
	private String bank;
	private String branch;
	private String ifsc;
	private String type;
	private int pin;
	private double balance;
	
public Account(String user,long accno,String bank,String branch,String ifsc,String type,int pin,double balance) {
		
		this.user=user;
		this.accno=accno;
		this.bank=bank;
		this.branch=branch;
		this.ifsc=ifsc;
		this.type=type;
		this.pin=pin;
		this.balance=balance;
		System.out.println("Account creation successful!");
		
	}
	
	public String getUser() {
		return user;
	}
	public double getAccno() {
		return accno;
	}
	
	public String getBank() {
		return bank;
	}

	public String getBranch() {
		return branch;
	}

	public String getIfsc() {
		return ifsc;
	}


	public String getType() {
		return type;
	}

	

	
	public double getbalance(int pin,long accno) {
		if(this.pin==pin &&this.accno==accno)
		{
			return balance;
		}
		System.out.println("Incorrect credentials");
		return balance;
	}
	public void withdraw(long accno,int pin,double amount) {
		if(this.accno==accno&&this.pin==pin)
		{
			System.out.println("Login Success ");
			if(amount>0 &&(balance-amount)>=2000)
			{
				balance-=amount;
				System.out.println("Amount debited! ");
				System.out.println(getbalance(pin,accno));
			}
			else
			{
				System.out.println("Insufficient amount");
			}
		}
		else
		{
			System.out.println("Invalid credentials!");
			
		}	
	}
	public void deposit(long accno,int pin,double amount) {
		
		if(this.pin==pin&&this.accno==accno) 
		{
			System.out.println("Login Success ");
			if(amount>0)
			{
				balance+=amount;
				System.out.println("Amount deposited");
				System.out.println(getbalance(pin,accno));
			}
			else
			{
				System.out.println("Enter valid amount");
			}
		}
		else
		{
			System.out.println("Invalid credentials!");
		}
	}
	
	

	
	public void setpin(long accno,int oldpin,int newpin ) {
		if(oldpin==pin&&this.accno==accno)
		{
			pin=newpin;
			System.out.println("Pin Updated");
		}
		else
		{
			System.out.println("Incorrect pin");
		}
	}
	
	
	
}
