package oops;

public class Notebook {
	String brandname;
	String type;
	double price;
	int pages;
	
	Pen p1=new Pen("Trimax","Black","Bollpen",40.00);
	
	public Notebook(String brandname, String type, double price, int pages) {
		super();
		this.brandname = brandname;
		this.type = type;
		this.price = price;
		this.pages = pages;
		System.out.println("Noteboook is created.......!");
		System.out.println("------------------------------------");
	}
	public void displayNotebook()
	{
		System.out.println("brandname:"+brandname);
		System.out.println("type :"+type);
		System.out.println("price :"+price);
		System.out.println("pages :"+pages);
		System.out.println("p1 :"+p1);
	}
	
	
	

}
