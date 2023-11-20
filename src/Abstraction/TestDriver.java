package Abstraction;

public class TestDriver {

	public static void main(String[] args) {
		
		Test t1=new Test1();
		System.out.println("From upcasting");
		t1.abc();
		t1.xyz();
		/*
		 * System.out.println("From Downsting"); Test1 t2=(Test1)(t1); t2.xyz();
		 */

	}

	}


