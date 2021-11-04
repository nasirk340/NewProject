package Javacalss11;

public class Car {

	String make;
	String model;
	String color;
	int year;
	double milage;
	
      void moveForward() {
  	System.out.println("Moving forward");
	// you can add as many behavior you can 
  	
  	// like breaks etc..
}

	
	public static void main(String[] args) {

		Car kazimsCar=new Car();
		
		kazimsCar.make="ferrai";
		kazimsCar.model="S.P.A 296 GTB";
		kazimsCar.color="gray";
		System.out.println("kazim car is " +kazimsCar.make);
		System.out.println("kazim car model is " +kazimsCar.model);
		System.out.println("kazim car color is " +kazimsCar.color);
		kazimsCar.moveForward();
		
		
		
		
	}
	
	
	
}
	

