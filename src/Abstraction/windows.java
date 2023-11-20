package Abstraction;

public class windows extends Dell
{
	public windows()
	{}
	
	@Override
	public void calculator(int a,int b)
	{
		int res=a+b;
        System.out.println(res);	

	}
	@Override
	public void calender()
	{
System.out.println("24/07/2023");	
		
	}
}
