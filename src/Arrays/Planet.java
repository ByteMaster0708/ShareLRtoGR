package Arrays;

import java.util.Arrays;

public class Planet {

		String name;
		int moons;
		String [] gases;
		
		public Planet()
		{}

		public Planet(String name, int moons, String[] gases) {
			super();
			this.name = name;
			this.moons = moons;
			this.gases = gases;
		}
		
		public void DisplayPlanet()
		{
			System.out.println("Name:"+name);
			System.out.println("Moons :"+moons);
			System.out.println("Gases:"+Arrays.toString(gases));
		}
		

	}


