package com.infotech;

public class InterfaceOverDefaultMethod implements Inf1, Inf2 {

	@Override
	public void display() {
		Inf1.super.display();
	}
	
	public static void main(String[] args) {
		InterfaceOverDefaultMethod display = new InterfaceOverDefaultMethod();
		display.display();
	}
	
}
