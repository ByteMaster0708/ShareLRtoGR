package MethodOverRiding;

public class Pubg1 {
	String name;
	int pass;
	
	Pubg1() {}

	public Pubg1(String name, int pass) {
		super();
		this.name = name;
		this.pass = pass;
		System.out.println("Login Success");
	}
	public void fire()
	{
		System.out.println("56 bullets");
	}
	public void jump()
	{
		System.out.println("Jumped 4 steps");
	}
	public void run()
	{
		System.out.println("2 steps");
	}
	public void turnleft()
	{
		System.out.println("Turn Right");
	}
	public void turnRight()
	{
		System.out.println("Turn Right");
	}
	
}
