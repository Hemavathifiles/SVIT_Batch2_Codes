package org.tnsif.acc.c2tc.interfacedemo;


interface  Vehicle6
{
	 void start();
	 void stop();
	 int Max_speed=120;
	 
	 default void repair()
	 {
		 System.out.println("Vehical is being repaired");
	 }
	 static void checkMaintaince()
	 {
		 System.out.println("Vehicle mainataince taken care");
	 }
}

class Car6 implements Vehicle6
{

	private String model;
	
	
	public Car6(String model) {
		super();
		this.model = model;
	}

	@Override
	public void start() {
		System.out.println("Car " + model + " is starting");
	}

	@Override
	public void stop() {
		
		System.out.println("Car " + model + " is stoping");
	}
	
}

class Bike implements Vehicle6
{

	private String type;
	
	
	public Bike (String type) {
		super();
		this.type=type;
	}

	@Override
	public void start() {
		System.out.println("Bike " + type + " is starting");
	}

	@Override
	public void stop() {
		
		System.out.println("Bike " + type + " is stoping");
	}
	
}

public class Default_Static_In_Interface_Demo {

	public static void main(String[] args) {
		Vehicle6 car=new Car6("Audi");
		Vehicle6 bike=new Bike("Duke");
		
		car.start();
		car.stop();
		car.repair();
		
		
		
		bike.start();
		bike.stop();
		bike.repair();
		
		Vehicle6.checkMaintaince();
		
		System.out.println("Maximun speed of Vehicle is : "+Vehicle6.Max_speed );
		

	}

}
