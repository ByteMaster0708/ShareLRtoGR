package Exception;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		m1();
	}
	
	public static void m1()
	{
		try
		{
			System.out.println(10/0);
		}
		
		
		//Compile time error try without catch
		
		/*
		 * finally { System.out.println("FInally block"); }
		 */
		catch (Exception e) 
		{
		System.out.println(10/0);
		//System.out.println(0);
			
//			int [] a=new int[1];
//			a[1]=10;
		}
		finally
		{
			int [] a=new int[1];
      		a[1]=10;
		}
	}

}
