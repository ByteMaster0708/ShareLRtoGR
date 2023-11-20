package MultilevelInheretence;

public class Army extends Defence{
	String attack1;
	int aircraft;
	int no1;
	String marshal;
	
	public Army()
	{
		
	}
	
	public Army(String attack1, int aircraft, int no1, String marshal,String minister, double budget, String cds, int total, int rank) {
		
		this.minister = minister;
		this.budget = budget;
		this.cds = cds;
		this.total = total;
		this.rank = rank;
		
		this.attack1 = attack1;
		this.aircraft = aircraft;
		this.no1 = no1;
		this.marshal = marshal;
	}
	public void dispalyArmy()
	{
		displayDefence();
		System.out.println(attack1);
		System.out.println(aircraft);
		System.out.println(no1);
		System.out.println(marshal);
		System.out.println("---------------------------------");
	}
}
