package com.info;

import java.util.Arrays;
import java.util.stream.Stream;

public class ClientTest {

	public static void main(String[] args) {
		String[] arr = new String[] {"A", "B", "C"};
		//Stream is an interface
		//Arrays has method stream() which added in java 8.
		Stream<String> stream = Arrays.stream(arr);
		//If u want to iterate using foreach loop
		for(String s : arr) {
		}
		//stream has method forEach which accepts Consumer as an argument.
		//we can use method reference to print them
		stream.forEach(System.out::println);
		System.out.println("======================");
		//Stream has a static method and u can pass array of elements
		//Stream has of method which accepts var-arg(0 or many no of elements)
		//this is static method so u can call by its class name
		Stream<String> of = Stream.of("A","B","C");
		of.forEach(System.out::println);
	}
}
