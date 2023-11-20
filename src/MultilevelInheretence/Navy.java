package MultilevelInheretence;

public class Navy extends Defence {
	String headquarters;
	String motto;
	int noofsoldiers;
	String chief;
	String commander;
	
	public Navy()
	{
		
	}
			
	public Navy(String headquarters, String motto, int noofsoldiers, String chief, String commander,String minister, double budget, String cds, int total, int rank) {
	
		this.minister = minister;
		this.budget = budget;
		this.cds = cds;
		this.total = total;
		this.rank = rank;
		
		this.headquarters = headquarters;
		this.motto = motto;
		this.noofsoldiers = noofsoldiers;
		this.chief = chief;
		this.commander = commander;
	}
	
	public void displayNavy()
	{
		displayDefence();
		System.out.println(headquarters);
		System.out.println(motto);
		System.out.println(noofsoldiers);
		System.out.println(chief);
		System.out.println(commander);
		System.out.println("---------------------------------");	
	}

}
