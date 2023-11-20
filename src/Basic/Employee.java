package Basic;

import java.util.Arrays;

public class Employee {
	
        String name;
		String favcolor [];
		int age;
		int yop;
		
		public Employee()
		{
			
		}

		public Employee(String name,String [] favcolor, int age, int yop) {
			super();
			this.name = name;
			this.age = age;
			this.yop = yop;
			this.favcolor=favcolor;
		}
		
		
		
		public  void DisplayEmployee() {
			
			System.out.println(name);
			System.out.println(Arrays.toString(favcolor));
			System.out.println(age);
			System.out.println(yop);
			
		}
		
		

	}


