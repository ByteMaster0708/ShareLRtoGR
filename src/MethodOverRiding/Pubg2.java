package MethodOverRiding;

public class Pubg2 extends Pubg1 {
	
	Pubg2()
	{}
	Pubg2(String name,int pass)
	{
	super(name, pass)	;
		}
	
	public void fire()
	{
		System.out.println("2 bullets");
	}
	public void turnleft()
	{
		System.out.println("Turn left");
	}
	public void turnRight()
	{
		System.out.println("Turn Right");
	}
}
