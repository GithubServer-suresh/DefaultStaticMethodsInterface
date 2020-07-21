package com.java8ListInterfaceComparator;

import java.util.ArrayList;
import java.util.List;

import com.comparator.Employee;

public class ClientTest {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Adam",30));
		empList.add(new Employee("Nicolas",20));
		empList.add(new Employee("Scott",15));
		empList.add(new Employee("Frank",34));
		
		System.out.println("=======Before Sorting==========");
		empList.forEach(System.out::println);
		
		empList.sort( (e1,e2)->e1.getName().compareTo(e2.getName()) );
		System.out.println("=======After Sorting==========");
		empList.forEach(System.out::println);
		
		
		
	}
}
