package oops;

public class Mobile {
	String Brand;
	String version;
	double price;
	String size;
	String camera;
	String type;
	
	Battery b1=new Battery("Samsung",12.5,4.87,1200.34,"Lithium");
	
	public Mobile()	{}
	
	public Mobile(String Brand,String version,double price,String size,String camera,String type)
	{
		this.Brand=Brand;
		this.version=version;
		this.price=price;
		this.size=size;
		this.camera=camera;
		this.type=type;
		
		System.out.println("Mobile is created..!");
		System.out.println("--------------------------");
	}
	public void displayMobile()
	{
		System.out.println("Brand:"+Brand);
		System.out.println("version:"+version);
		System.out.println("price:"+price);
		System.out.println("size:"+size);
		System.out.println("camera:"+camera);
	    System.out.println("type:"+type);
		
	}
	
	
	

}
