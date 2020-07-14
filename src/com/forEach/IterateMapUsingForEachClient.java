package com.forEach;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IterateMapUsingForEachClient {
	public static void main(String[] args) {
		Map<Integer,Employee> map = new HashMap<>();
		map.put(101, new Employee("Suri","Suir@gmail.com",900.00));
		map.put(103, new Employee("Smith","Smith@gmail.com",800.00));
		map.put(102, new Employee("Adam","Adam@gmail.com",700.00));
		//U can use entrySet() to iterate 
		Set<Entry<Integer, Employee>> entrySet = map.entrySet();
		//This entrySet returns Set. U can use iterator or enhanced for loop to iterate over Set.
		for(Entry<Integer, Employee> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		System.out.println("=========================");
		Set<Integer> keySet = map.keySet();
		for(Integer key : keySet) {
			System.out.println(key);
			System.out.println(map.get(key));
		}
		
		System.out.println("=======Using forEach===========");
		map.forEach((k,v)->System.out.println(k + "\t" +v));
	}
}
