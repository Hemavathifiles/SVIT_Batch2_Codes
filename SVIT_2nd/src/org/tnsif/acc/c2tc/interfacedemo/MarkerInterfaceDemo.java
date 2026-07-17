package org.tnsif.acc.c2tc.interfacedemo;

public class MarkerInterfaceDemo {

	public static void main(String[] args) {
		
		Registerable s=new Student(101,"Anil",50000,"Java");
		Registerable s1=new Student(102,"Sushma",50000,"Java");
		
		Object obj=new Object();
		
		if(obj instanceof Registerable )
		{
			System.out.println("Student is registered for this course");
		}
		else
		{
			System.out.println("Student is not registered for this course");
		}
	}

}
