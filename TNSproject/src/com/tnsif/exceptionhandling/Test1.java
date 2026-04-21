package com.tnsif.exceptionhandling;
//demo for with matching catch block 
public class Test1 {
	public static void main(String[] args) {
		try {
			System.out.println(66/0);
		}
		catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
		} 
		finally {
			System.out.println("welcome");
		}
	}  
}
