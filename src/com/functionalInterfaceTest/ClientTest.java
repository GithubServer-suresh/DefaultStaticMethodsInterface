package com.functionalInterfaceTest;

public class ClientTest {

	public static void main(String[] args) {

		createThreadUsingAnonymousClass();
		//for anonymous class, 1 extra .class file will be generated
		//If u comment above line,Eclipse will not generate .class file 
		//create another method 
		createThreadUsingLambdaExpression();
	}
	
	private static void createThreadUsingLambdaExpression() {
		
		//What Lambda expression says : u don't need to write and FunctionalInterface has only 1 abstract method
		//for this lambda expression, it will not generate any extra .class file but for anonymous class .class file will be generated  
		//so this is advantage of Lambda expression
		Runnable r = () -> System.out.println("My task is executing..");
		 Thread thread = new Thread(r);
		 thread.start();
		
	/*	Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("My task is executing...");
			}	
		};  */
		
	}

	private static void createThreadUsingAnonymousClass() {
		//Runnable is an interface and We might create a separate class which implements Runnable interface 
		//and u can create Runnable object. And Runnable object u can pass to the Thread constructor and finally u can run the thread
		//another approach is using anonymous class
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("My task is executing...");
			}	
		};
		//This is Runnable object and will have to pass in your Thread constructor
		//create object of thread
		Thread thread = new Thread(r);
		thread.start();
		
		//go to bin folder of this project
		//It will create 2 .class files . one is ClientTest.class
		//second is :: we have created anonymous class 
		//Eclipse has generated one more .class file for anonymous class.
		
		//The above code is very huge and we can convert the about code into Lambda expression		
	}
	
	
	
}
