package org.tnsif.acc.c2tc.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
	Map<Integer , Integer> map=new HashMap<>();
	
	map.put(1, 100); //key - 1 , value -100
	map.put(2, 200);
	map.put(3, 300);
	map.put(4, 400);
	
	System.out.println("Intial Mapping "+map);
	
	
	int valueforkey1=map.get(1);
	System.out.println("Value of key 1 : "+valueforkey1);
	
	map.put(2,250);
	System.out.println("Map after updating value for key '2' "+map);
	
	map.remove(3);
	System.out.println("map after removing key 3");
	
    boolean haskey1	=map.containsKey(5);
    System.out.println("Map contains key 5 :"+haskey1);
    
   
    boolean hasValue = map.containsValue(300);
    System.out.println("Map contains value : "+hasValue);
    
    int size=map.size();
    System.out.println("size of the map "+ size);
    
    map.clear();
    System.out.println("Map after clearing :"+map);
    
	}

}
