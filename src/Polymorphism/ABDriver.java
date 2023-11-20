package Polymorphism;

public class ABDriver {

	public static void main(String[] args) {
 
		A a=new B();
		a.xyz();
		a.abc();
		
		
		System.out.println(a.s);
		System.out.println(a.i);
		

	}

}
