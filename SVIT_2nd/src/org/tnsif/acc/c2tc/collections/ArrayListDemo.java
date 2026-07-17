package org.tnsif.acc.c2tc.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<String> fruits=new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Dragon");
		
		System.out.println("First fruit :"+ fruits.get(0));
		
		fruits.set(1,"Cherry");
		
		System.out.println("After set action "+fruits);
		
		fruits.remove(2);
		
		System.out.println("After remove action "+fruits);
		
		if(fruits.contains("Apple"));
		{
			System.out.println("Apple is in the list");
		}
	     for ( String fruit :fruits) 
	     {
		 System.out.println(fruit);
	     }
	     
	     fruits.clear();
	     System.out.println("List size "+fruits.size());
	}

}
