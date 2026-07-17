package org.tnsif.acc.c2tc.collections;

import java.util.ArrayList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<String> fruits=new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Dragon fruits");
		
		
		System.out.println("First : "+fruits.get(0));
		
		fruits.set(1,"Cherry");
		
		System.out.println(fruits);
		
		

	}

}
