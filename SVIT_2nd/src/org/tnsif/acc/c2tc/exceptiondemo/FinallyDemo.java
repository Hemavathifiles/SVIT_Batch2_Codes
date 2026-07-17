package org.tnsif.acc.c2tc.exceptiondemo;

public class FinallyDemo {

	public static void main(String[] args) {
		try {
			int data=100/0;
			System.out.println(data);
		}catch(Exception e)
		{
			System.out.println("Exception caught :"+ e);
		}
		
		finally {
			System.out.println("This block always executes");
		}
		
	}

}
