package com.innerClasses;

public class MethodLocalInnerClass {

	private int outerData = 1000;

	public void display() {

		int finalData = 5000;
		class InnerClass {
			private int innerData = 3000;
			public void invoke() {
				System.out.println("InnerClass:invoke method is called:" + outerData);
				System.out.println("InnerClass:invoke method is called: " + innerData);
				System.out.println("InnerClass:invoke method is called: "+ finalData);
			}
		}
		new InnerClass().invoke();

	}


}
