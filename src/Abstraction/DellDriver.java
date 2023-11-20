package Abstraction;

class DellDriver

{
	public static void main(String []args)
	{
		
		
		  Dell d1=new windows();//upcasting
		  d1.calculator(10,30);
		  d1.calender();
		  d1.welcome("RAju");
		  
		Dell d2=new Linux();//upcasting
		d2.calculator(40,20);
		d2.calender();
		d2.welcome("Chutki");
		
			
	}
}