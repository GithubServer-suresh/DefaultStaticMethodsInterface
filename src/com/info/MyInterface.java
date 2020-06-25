package com.info;

import java.util.Collections;
import java.util.List;

import com.info.model.Student;

public interface MyInterface {

	default public List<Student> sortStudents(List<Student> stuList){
		Collections.sort(stuList);
		return stuList;
	}
	
	static public void greet(String name) {
		System.out.println("Welcome "+ name);		
	}
	
	public abstract Integer getMinNum(List<Integer> intList); 
	
	
}
