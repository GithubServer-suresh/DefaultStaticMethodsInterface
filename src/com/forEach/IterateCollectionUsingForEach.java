package com.forEach;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class IterateCollectionUsingForEach {

	public static void main(String[] args) {
		
		List<Student> stuList = new ArrayList<>();
		stuList.add(new Student("suresh",26));
		stuList.add(new Student("Naresh",25));
		stuList.add(new Student("Mahesh",27));
		
		//so we can write lambda for functional interface
		//No need to write a seperate class to extend functional interface
		System.out.println("Using Lambda Expressions");
		stuList.forEach(t->System.out.println(t));
		System.out.println("=================");
		System.out.println("Using Method Reference");
		stuList.forEach(System.out::println);
		//U can use List or Set to iterate over elements.
		
	}
}
/*
class MyConsumer implements Consumer<Student> {
	@Override
	public void accept(Student t) {
		System.out.println(t);
	}
	
}

*/