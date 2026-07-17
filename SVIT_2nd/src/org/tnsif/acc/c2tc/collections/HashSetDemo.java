package org.tnsif.acc.c2tc.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<String> fruits=new HashSet<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add(null);
		fruits.add(null);
		System.out.println("Hashset "+fruits);
		

	}

}
