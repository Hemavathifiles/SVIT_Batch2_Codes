package org.tnsif.acc.c2tc.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		Set<String> set=new LinkedHashSet<>();
		set.add("Cherry");
		set.add("Banana");
		set.add(null);
		set.add(null);
		
		System.out.println("LinkedhashSet "+set);
	}

}
