package com.parallelStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamTest {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		list.add(new Student("suresh",34));
		list.add(new Student("amit",43));
		list.add(new Student("abc",13));
		list.add(new Student("Smith",143));
		list.add(new Student("Peter",30));
		list.add(new Student("Bob",31));
		list.add(new Student("Greg",12));
		//parallelStream() method available in Collection interface.So list can easily call this method 
		Stream<Student> parallelStream = list.parallelStream();
		System.out.println("Student Data send for Processing:::");
		//We can call forEach loop which gives value for Consumer(i.e lambda expression).
		parallelStream.forEach(s->doProcess(s));
		//parallelStream.forEach(System.out::println);
	}
	//In real scenario,u may pass every student object to method doProcess.We do some processing.
	//write Business logic for this method.
	//After processing Student data - u might store data in some database or in file system 
	private static void doProcess(Student s) {
		System.out.println(s);
	}
}
