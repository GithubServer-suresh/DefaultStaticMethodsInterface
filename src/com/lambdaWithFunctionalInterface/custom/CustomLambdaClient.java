package com.infotech.custom;

public class CustomLambdaClient {
	public static void main(String[] args) {
		
		//using Lambda expression without parameter
		MyInterface1 myInterface1 = () ->
				System.out.println("THis method executes using anonymous class");
		myInterface1.method1();
		System.out.println("----------------");
		//using Lambda expression with parameter
		//This is implementation of MyInterface2
		MyInterface2 myInterface2= (name) -> System.out.println("This is "+name);
		myInterface2.method2("suresh");
		
		System.out.println("-=-=-=--==-==-=--=-===-");
		MyInterfaceHavingMoreParameter myParam = (String name,int age) -> {
			System.out.println("This is "+age);
			System.out.println("Age is "+name);
		};
		myParam.method3("Suri", 24);
	}
	
}
