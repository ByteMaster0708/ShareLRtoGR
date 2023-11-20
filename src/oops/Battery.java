package oops;

public class Battery {
	
	String brand;
	double voltage;
	double backup;
	double price;
	String type;
	
	public Battery() {}
	
	public Battery(String brand,double voltage,double backup,double price,String type)
	{
		this.brand =brand;
		this.voltage=voltage;
		this.backup=backup;
		this.price=price;
		this.type=type;
		System.out.println("Battery is created");
		System.out.println("------------------------");
		
	}
	
	public void displayBattery()
	{
		System.out.println("Brand:"+brand);
		System.out.println("Voltage:"+voltage);
		System.out.println("Backup:"+backup);
		System.out.println("Price:"+price);
		System.out.println("Type:"+type);
	}
}
