package org.tnsif.acc.c2tc.collections;

import java.util.List;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		List<Integer> numbers=new Vector<>();
		
		
		numbers.add(20);
		numbers.add(10);
		numbers.add(30);
		numbers.add(50);
		
		
		System.out.println(numbers);
		
		System.out.println("First number :"+ numbers.get(0));
		
		numbers.set(1, 99);
		
		System.out.println("list after modify : "+numbers);
		
		numbers.remove(Integer.valueOf(20));
		
		System.out.println("list after remove action : "+numbers);
		
		if(numbers.contains(30))
		{
			System.out.println("30 is in the list");
		}
		
		else
		{
			System.out.println("Required element is not in the list");
		}
		
		    for( Integer number:numbers) {
			
			     System.out.println(numbers);
		      }
		    
		    numbers.clear();
		    
		    System.out.println(numbers);
	}

}
