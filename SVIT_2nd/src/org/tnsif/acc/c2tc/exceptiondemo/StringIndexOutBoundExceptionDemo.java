package org.tnsif.acc.c2tc.exceptiondemo;

public class StringIndexOutBoundExceptionDemo {

	public static void main(String[] args) {
		String str="hello world";
		try {
			char ch = str.charAt(12);
			  System.out.println(ch);
		}catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		  System.out.println("rest of the code");
	}

}
