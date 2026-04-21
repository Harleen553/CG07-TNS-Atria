package com.tnsif.exceptionhandling;

public class ThrowsDemo {

	static void divide() throws ArithmeticException {
		int a = 10/0;
	}
	public static void main(String[] args) {
		try {
			divide();
		}
		catch (ArithmeticException ae) {
			System.out.println("cannot be divide by zero");
		}	
	}
}
