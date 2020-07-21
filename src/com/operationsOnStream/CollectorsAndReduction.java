package com.operationsOnStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsAndReduction {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Scott");
		list.add("Adam");
		list.add("Greg");
		list.add("Frank");
		
		List<String> collect = list.stream().map(element->element.toUpperCase()).collect(Collectors.toList());
		collect.forEach(System.out::println);
		
	}

}
