package MultilevelInheretence;

public class Defence {
	
        String minister;
        double budget;
        String cds;
        int total;
        int rank;
        
        public Defence()
        {
        	
        }
        
		public Defence(String minister, double budget, String cds, int total, int rank) {
			super();
			this.minister = minister;
			this.budget = budget;
			this.cds = cds;
			this.total = total;
			this.rank = rank;
		}
		public void displayDefence()
		{
			System.out.println(minister);
			System.out.println(budget);
			System.out.println(cds);
			System.out.println(total);
			System.out.println(rank);
			System.out.println("---------------------------------");
		}
        
}
