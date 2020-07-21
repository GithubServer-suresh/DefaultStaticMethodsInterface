package com.infotech.custom.lambdaExpressionWithReturnValue;

public class LambdaExpressionWithReturnValue {
	public static void main(String[] args) {
		
		MyInterfacce myInterface = (n1,n2) ->{
			return n1>n2;
		};
		System.out.println(myInterface.test(40, 30));
		System.out.println(myInterface.test(30, 40));
	}
}
