package oopss;

public class Car {   

       	  String brand;
	      double price;
	      String color;
	      String type;
	      double mileage;
	      
	      Engine e1= new Engine(4, "Petrol", 4, "v4", 250, 50);
	 
	      public Car() {}
	      
	      public Car(String brand, double price, String color, String type, double mileage, Engine e1) {
	  		this.brand = brand;
	  		this.price = price;
	  		this.color = color;
	  		this.type = type;
	  		this.mileage = mileage;
	  		System.out.println("Car is created");
	  	}
	      public void displayCar() {
	    	  System.out.println("Brand:"+brand);
	    	  System.out.println("Brand:"+price);
	    	  System.out.println("Brand:"+color);
	    	  System.out.println("Brand:"+type);
	    	  System.out.println("Brand:"+mileage);
	      }
	      
	    	  
	      }

