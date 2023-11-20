package oops;

public class Pen {
	String Brand ;
	String Color;
	String type;
	double price;
	
	public Pen(String brand, String color, String type, double price) {
		Brand = brand;
		Color = color;
		this.type = type;
		this.price = price;
		System.out.println("Pen is created...!");
	}
	public void DisplayPen()
	{
		System.out.println("Brand:"+Brand);
		System.out.println("Color:"+Color);
		System.out.println("type:"+type);
		System.out.println("price:"+price);
	}
	

}
