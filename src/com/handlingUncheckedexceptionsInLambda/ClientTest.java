package com.handlingUncheckedexceptionsInLambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ClientTest {

	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(3,7,1,10,9,0,4);
		integers.forEach(consumerWraper(i-> System.out.println(50/i),Exception.class));
	}

	/*private static Consumer<Integer> lambdaWrapper(Consumer<Integer> consumer) {
		return i->{
			try {
				consumer.accept(i);
			} catch(ArithmeticException e) {
				System.out.println("Arithmetic exception occurred: " +e.getMessage());
			}
		};*/
	
	private static <T,E extends Exception> Consumer<T> consumerWraper(Consumer<T> consumer, Class<E> clas) {
		return i-> {
			try {
				consumer.accept(i);
			} catch (Exception e) {
				e.printStackTrace();
			}
		};
	} 
	
	
}
