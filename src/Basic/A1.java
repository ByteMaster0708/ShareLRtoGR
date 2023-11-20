package Basic;

public class A1 {
	
	int a;
	static int b;
	{
		System.out.println("From non-static block");
		
	}
	static
	{
		System.out.println("From static block");
	}
	A1()
	{
		System.out.println("From constructor");
	}
	
	public static void add()
	{
		System.out.println("From add static");
	}
	public void multiply()
	{
		System.out.println("From multipy");
	}
	
	public static void main(String[] args) {

		A1 ref=new A1();
		add();
		ref.multiply();
	}

}
