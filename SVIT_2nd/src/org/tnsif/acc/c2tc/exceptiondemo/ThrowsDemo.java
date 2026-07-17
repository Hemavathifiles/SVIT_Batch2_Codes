package org.tnsif.acc.c2tc.exceptiondemo;

import java.io.IOException;

public class ThrowsDemo {

	
	void m1()
	{
		System.out.println("No Exception");
	}
	void m2() throws IOException
	{
		System.out.println("Device error");
	}
	
	void m3() throws ArithmeticException , IOException ,ClassNotFoundException
	{
		System.out.println("File not found");
		
	}
	
	
	public static void main(String[] args) {
		ThrowsDemo demo=new ThrowsDemo ();
		demo.m1();
		  
		try {
			demo.m2();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		try
		{
			demo.m3();
		}catch(IOException e)
		{
			System.out.println(e);
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
		
	}

}
