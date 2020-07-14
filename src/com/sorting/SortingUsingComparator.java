package com.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingUsingComparator {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Suri","Suri@gmail.com",4500.00));
		empList.add(new Employee("Adams","Adams@gmail.com",5400.00));
		empList.add(new Employee("Peter","Peter@gmail.com",2500.00));
		System.out.println("Employee List before sorting ...");
		empList.forEach(System.out::println);

		//Traditional way - Create a class which implements Comparator interface
		Collections.sort(empList, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		//Lambda Expressions
		Collections.sort(empList, (e1,e2) -> e1.getName().compareTo(e2.getName()));		

		System.out.println("--------------");

		System.out.println("Employee List after sorting ...");
		empList.forEach(System.out::println);

	}

}
