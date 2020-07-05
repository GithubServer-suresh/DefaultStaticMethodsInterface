package com.innerClasses;

public class ClientAnonymousInnerClass {

	public static void main(String[] args) {
		MyInterface myInterfaceImpl = new MyInterfaceImpl();
		myInterfaceImpl.display();
		System.out.println("********************");
		//using anonymous class
		MyInterface anonymousClass = new MyInterface() {
			@Override
			public void display() {
				System.out.println("Anonymous class");
			}
		};
		anonymousClass.display();
		System.out.println("----------JDK example----------");
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("run method");
			}
		};
		Thread t = new Thread(r);
		t.start();
	}

}
