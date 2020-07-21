package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparingDemo {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Adam",30));
		empList.add(new Employee("Nicolas",20));
		empList.add(new Employee("Scott",15));
		empList.add(new Employee("Frank",34));
		
		System.out.println("==========Before Sorting==========");
		empList.forEach(System.out::println);
		
		//Comparator<Employee> comparing = Comparator.comparing(Employee::getName);
		Comparator<Employee> comparing = Comparator.comparing(Employee::getName,String.CASE_INSENSITIVE_ORDER);
		Collections.sort(empList,comparing);
		
		System.out.println("==========After Sorting==========");
		empList.forEach(System.out::println);
	}
}
