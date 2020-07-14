package com.operationsOnStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ClientTest {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("sean");
		list.add("Martin");
		list.add("Frank");
		list.add("Andrew");
		/*//we know that we have method is called Stream.
		//This method declared in Collection interface which return type is Stream which is intermediate operation.
		Stream<String> stream = list.stream();//stream() return type is Stream. This is considered as a Intermediate operation. 
		//Stream interface has a method distinct() which again returns Stream itself. so it is also considered as intermedaite operation.
		Stream<String> distinct = stream.distinct();
		//count() returns long which is terminal operation. 
		long count = distinct.count();
		System.out.println(count);*/
		
		//U can also use chaining for above
		long count = list.stream().distinct().count();
		System.out.println(count);
		
		
		
		List<Student> stuList = new ArrayList<>();
		stuList.add(new Student("John",10));
		stuList.add(new Student("Peter",30));
		stuList.add(new Student("David",23));
		stuList.add(new Student("Ervin",70));
		stuList.add(new Student("Frankie",54));
		stuList.add(new Student("Greg",9));
		Stream<Student> filter = stuList.stream().filter(s->s.getAge()>25);
		filter.forEach(System.out::println);
		
		System.out.println("***********************************");
		boolean allMatch = stuList.stream().allMatch(s->s.getName().contains("n"));
		System.out.println(allMatch);
		
		System.out.println("--------------------------");
		boolean anyMatch = stuList.stream().anyMatch(e->e.getAge()>35);
		System.out.println(anyMatch);
		
		System.out.println("--------------------------");
		boolean noneMatch = stuList.stream().noneMatch(e->e.getAge()>55);
		System.out.println(noneMatch);
		
		
		
		
		
		
		
		
		
	}
}
