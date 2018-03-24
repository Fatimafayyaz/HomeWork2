package hwpracticelab;

public class TestVehicle {

	public static void main(String[] args) {
		
		Vehicle v1=new Vehicle("John");
		Vehicle v2= new Vehicle("Larry");
				
		System.out.println("vehicle v1  " +  " belongs to " + v1.getOwner());
		System.out.println("vehicle v2  " +  " belongs to " + v2.getOwner());
		System.out.println("max vehicle assigned " + Vehicle.maxVidNumber());
		Vehicle v3= new Vehicle("Mark");
		
		System.out.println("vehicle v3   " + "belongs to " + v3.getOwner());
	    System.out.println("max vehicle assigned " + Vehicle.maxVidNumber());//call static method using class name
	   
	    System.out.println("Vehicle v1 current speed is "+ v1.getSpeed());
	    v1.changeSpeed(50);
	    System.out.println("Now v1 new speed is " + v1.getSpeed());
	   
	    Vehicle v4=new Vehicle("Stephen");
	    System.out.println("max vehicle assigned " + Vehicle.maxVidNumber());
	    v4.setOwner("aftab");
	    System.out.println("v4 new owner is :- " + v4.getOwner());
	    System.out.println("v4 direction is :-  " + v4.getDirection());
	    v4.ChangeDirection(150);
	    System.out.println("v4 new direction is :-  " + v4.getDirection());
	    System.out.println();
	}
	
}
