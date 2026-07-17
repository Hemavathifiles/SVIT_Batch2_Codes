package org.tnsif.acc.c2tc.exceptiondemo;

public class NullPointerExceptionDemo {

	public static void main(String[] args) {
	     String str=null;
	     try
	     {
	    	 System.out.println(str.length());
			} catch (NullPointerException e) {
				System.out.println("Null Pointer Exception Handled");
			}
	     System.out.println("Rest of the code...");
	     
	}

}
