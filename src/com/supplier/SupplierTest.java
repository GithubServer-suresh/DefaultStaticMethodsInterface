package com.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		Supplier<Integer> supplier = SupplierTest::getNum;
		for(int i=1;i<21;i++) {
			System.out.println(supplier.get());
		}
		
	}
	private static Integer getNum() {
		Random random = new Random();
		return random.nextInt(100);
	}

}
