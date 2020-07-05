package com.innerClasses;

public class OuterClass {

	private int outerData = 100;
	
	//this class is defined a member of this outer class
	//public,private,protected,default access modifiers are allowed for inner classes
	 class InnerClass {
		private int innerData = 200;
		public void invoke() { 
			System.out.println("InnerClass: invoke method is called : " + outerData);
			display();
		}
	}
	 	 
	public void display() {
		System.out.println("Outerclass:display method is called...");
		InnerClass innerClass = new InnerClass();
		System.out.println("Accessing innerclass Data: " + innerClass.innerData);
	}
}
