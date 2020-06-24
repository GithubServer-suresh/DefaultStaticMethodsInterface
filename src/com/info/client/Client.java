package com.info.client;

import java.util.ArrayList;
import java.util.List;

import com.info.MyInterface;
import com.info.impl.MyInterfaceImpl;
import com.info.model.Student;

public class Client {

	public static void main(String[] args) {
		MyInterface myInterface = new MyInterfaceImpl();
		List<Student> stuList = new ArrayList<Student>(){
				new Student("suri",10),
				new Student("suri1",20),
				new Student("suri3",30)
		};
		myInterface.sortStudents(stuList);
	}
}
