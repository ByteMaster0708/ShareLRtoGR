package Arrays;

public class PlanetDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Planet [] p=new Planet[4];
		
		p[0]=new Planet("Earth",1,new String[] {"O2","CO2","H2"});
		p[1]=new Planet("JUPITER",79,new String[] {"CO"});
		p[2]=new Planet("MARS",1,new String[] {"O2","CO","CH4","Ar","N2"});
		p[3]=new Planet("VENUS",1,new String[] {"HE","H2"});
		
		maxGasPlanet(p);
	 //  p[1].DisplayPlanet();
	}
	
	public static void maxGasPlanet(Planet[]p)
	{
		int max=0;
		
		for (int i = 0; i < p.length; i++) {
			
			if (p[i].gases.length>max) {
				
				max=p[i].gases.length;
			}
		}
		for (int i = 0; i < p.length; i++) {
			
			if (p[i].gases.length==max) {
				
				p[i].DisplayPlanet();
			} 
		}
		
	}

}
