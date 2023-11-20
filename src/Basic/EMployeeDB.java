package Basic;

import java.util.Iterator;

public class EMployeeDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee [] e=new Employee[4];
		
		e[0]=new Employee("Akash", new String[] {"red","yellow","pink","white","grey"},65,2000);
		e[1]=new Employee("Akash", new String[] {"red","orange","Black"},45,2016);
		e[2]=new Employee("Akash", new String[] {"red","yellow","Grey","white"},34,2000);
		e[3]=new Employee("Akash", new String[] {"red","yellow","green"},50,1998);
		
		
		MaxFavColor(e);
	}
	
	
	public static void MaxFavColor(Employee[]e)
	{
		
		int max=0;
		
		for (int i = 0; i < e.length; i++) {
			
			if (e[i].favcolor.length>max) {
				
				max=e[i].favcolor.length;
			}
		
		}
		
		for (int i = 0; i < e.length; i++) {
			
			if (e[i].favcolor.length==max) {
				
				e[i].DisplayEmployee();
			}
		}
		
			
	}

}
