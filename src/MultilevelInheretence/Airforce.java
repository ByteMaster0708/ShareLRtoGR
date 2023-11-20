package MultilevelInheretence;

public class Airforce extends Defence{
	String attack1;
	int aircraft;
	int no1;
	String marshal;
	
	public Airforce()
	{
		
	}
	
	public Airforce(String attack1, int aircraft, int no1, String marshal,String minister, double budget, String cds, int total, int rank) {
		
		super();
		
		this.attack1 = attack1;
		this.aircraft = aircraft;
		this.no1 = no1;
		this.marshal = marshal;
	}
	public void dispalyAircraft()
	{
		displayDefence();
		System.out.println(attack1);
		System.out.println(aircraft);
		System.out.println(no1);
		System.out.println(marshal);
		System.out.println("---------------------------------");
	}
}
