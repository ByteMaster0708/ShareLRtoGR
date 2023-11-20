package Polymorphism;

public class pocketpitbull extends pitbull {
 
	String name="Entertainer";
	double price=65432;
	
	public void display() 
	{
		System.out.println(name);
		System.out.println(price);
	}
	
	public void Both() 
	{
	display();
	super.display();
	System.out.println(super.name);
	System.out.println(super.price);
	
	}
}
