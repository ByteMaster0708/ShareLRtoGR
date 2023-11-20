package oopss;

public class Engine {

	int stroke;
	String fuel;
	int cy;
	String type;
	int cc;
	int bhp;
	
	public Engine() {}
	
	public Engine(int stroke,String fuel,int cy,String type,int cc,int bhp) {
		
		this.stroke=stroke;
		this.fuel=fuel;
		this.cy=cy;
		this.type=type;
		this.cc=cc;
		this.bhp=bhp;
		System.out.println("Engine Created");
	}
	
	public void displayEngine() {
		System.out.println("Stroke"+stroke);
		System.out.println("Fuel"+fuel);
		System.out.println("Type"+type);
		System.out.println("CC"+cc);
		System.out.println("BHP"+bhp);
		System.out.println("");
		
	}
}
