package Polymorphism;

public class PitbullDriver {

	public static void main(String[] args) {
	
        pitbull p1=new pitbull();
		p1.display();
		System.out.println(p1 instanceof pocketpitbull);
	
		pocketpitbull p2=new pocketpitbull();
		p2.display();
		System.out.println(p2 instanceof pitbull);
		
	}	

}
