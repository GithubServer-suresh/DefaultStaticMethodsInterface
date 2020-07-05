package com.infotech.withoutlambda.model;

public class Client {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		Thread thread1 = new Thread(myThread);
		thread1.start();
	}
}
