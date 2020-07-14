package com.sorting;

import java.util.Comparator;
import com.sorting.Employee;

public class EmployeeNameSorter implements Comparator<Employee> {
	//Sort based on employee name
	@Override
	public int compare(Employee o1,Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
