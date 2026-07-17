package org.tnsif.acc.c2tc.di;

public class Car {

	Engine engine =new Engine();
	
	void drive()
	{
		engine.start();
		System.out.println("Car is Running");
		
	}
	
}
