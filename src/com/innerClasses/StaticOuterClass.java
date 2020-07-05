package com.innerClasses;

public class StaticOuterClass {
	private static int outerData = 1000;
	private int nonStaticData = 5000;
	
	static class StaticInnerClass {
		private int innerData = 3000;
		public void invoke() {
			System.out.println("static InnerClass: invoke method is called" + outerData);
			StaticOuterClass.mdisplay();
			//System.out.println(nonStaticData);//can't access non static memeber outer class 
		}
	}
		public static void mdisplay() {
			System.out.println("OuterClass: display method is called..");
			StaticInnerClass innerClass = new StaticInnerClass();
			System.out.println("Accessing innerClass Data : " + innerClass.innerData);
		}	
}
