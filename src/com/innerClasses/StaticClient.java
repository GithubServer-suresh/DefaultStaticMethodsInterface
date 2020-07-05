package com.innerClasses;

public class StaticClient {
	public static void main(String[] s) {
		StaticOuterClass.StaticInnerClass ref= new StaticOuterClass.StaticInnerClass();
		ref.invoke();
	}
}
