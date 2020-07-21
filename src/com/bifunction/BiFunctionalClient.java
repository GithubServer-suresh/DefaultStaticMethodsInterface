package com.bifunction;
import java.util.function.BiFunction;

public class BiFunctionalClient {

	public static void main(String[] args) {
		//Custom objects u can use in below
		BiFunction<Integer, Integer, String> bifunction = (num1, num2)->"Result is "+(num1+num2);
		System.out.println(bifunction.apply(100, 200));
	}
}
