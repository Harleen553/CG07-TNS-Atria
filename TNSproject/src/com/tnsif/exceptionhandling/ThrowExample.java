package com.tnsif.exceptionhandling;
// example of throw
public class ThrowExample {

	public static void main(String[] args) {
		//int age = 16;
		int age = 20;
		
		if (age<18) {
			throw new ArithmeticException ("You are not eligiable to vote");
		}
		else {
			System.out.println("You are eligiable to vote.");
		}		
	}
}
