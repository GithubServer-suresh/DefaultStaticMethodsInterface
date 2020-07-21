package com.bipredicate;
import java.util.function.BiPredicate;
public class BiPredicateTest {

	public static void main(String[] args) {
		BiPredicate<Integer, String> bipredicate = (i,o)->i>20&&o.startsWith("R");
		System.out.println(bipredicate.test(30, "Rest"));
		System.out.println(bipredicate.test(10, "Martin"));
		System.out.println(bipredicate.test(40, "Right"));
		
	}

}
