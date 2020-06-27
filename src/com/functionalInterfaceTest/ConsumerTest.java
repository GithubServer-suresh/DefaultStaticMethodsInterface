package com.functionalInterfaceTest;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {
	public static void main(String[] args) {
		List<String> nameList = new ArrayList<>();
		nameList.add("Sean");
		nameList.add("Andrew");
		nameList.add("Rocky");
	nameList.forEach(
			new Consumer<String>() {
				@Override
				public void accept(String name) {
					System.out.println(name);
				}
			}
		);
	System.out.println("Using Lambda Expression");
	nameList.forEach( (String name) -> System.out.println(name));
	}
}
