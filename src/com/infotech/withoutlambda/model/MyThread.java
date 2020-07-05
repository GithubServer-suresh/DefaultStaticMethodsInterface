package com.infotech.withoutlambda.model;

public class MyThread implements Runnable{
	
	@Override
	public void run() {
		//In real time scenario,some service method which u want to execute as a seperate thread
		System.out.println("My task is executing..");
	}
}
