package com.info.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.info.MyInterface;
import com.info.impl.MyInterfaceImpl;
import com.info.model.Student;

public class Client {

	public static void main(String[] args) {
		MyInterface myInterface = new MyInterfaceImpl();
		List<Student> stuList = new ArrayList<Student>();
		stuList.add(new Student("suri",10));
		stuList.add(new Student("suresh",20));
		System.out.println(stuList);
		List<Integer> intList = Arrays.asList(1,7,9,10,2);
		System.out.println(myInterface.getMinNum(intList));
		List<Student> stuList1 = Arrays.asList(
						new Student("suri1",20),
						new Student("suri2",40),
						new Student("suri3",30));
		System.out.println(stuList1);	
	}
}
