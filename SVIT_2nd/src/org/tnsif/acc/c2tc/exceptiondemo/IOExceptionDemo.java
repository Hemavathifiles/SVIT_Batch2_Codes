package org.tnsif.acc.c2tc.exceptiondemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class IOExceptionDemo {

	public static void main(String[] args) throws FileNotFoundException {
		try
		{
			BufferedReader br=new BufferedReader(new FileReader ("C:\\Users\\Admin\\OneDrive\\Desktop\\Java training Notes\\demo.txt"));
	        String data= " ";
			while((data=br.readLine())!=null)
			{
				System.out.println(data);
			}	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
