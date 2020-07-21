package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Java8ClientTest {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Adam",30));
		empList.add(new Employee("Nicolas",20));
		empList.add(new Employee("Scott",15));
		empList.add(new Employee("Frank",34));
		//I want to sort this list based on employee name.
		//create separate class EmployeeNameSorter implements Comparator
		
		System.out.println("==============Before Sorting========================");
		for(Employee employee : empList) {
			System.out.println(employee);
		}
		
		Collections.sort(empList, (e1,e2) -> 
				e1.getName().compareTo(e2.getName()));
		
		System.out.println("==============After Sorting========================");
		for(Employee employee : empList) {
			System.out.println(employee);
		}
	}
}
