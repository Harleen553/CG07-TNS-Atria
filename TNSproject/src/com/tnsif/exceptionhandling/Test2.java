package com.tnsif.exceptionhandling;
// no matching 
public class Test2 {

	public static void main(String[] args) {
		try {
			System.out.println(66/0);
		}
		catch (ArrayIndexOutOfBoundsException aie) {
			System.out.println(aie.getMessage());
		}
		finally {
			System.out.println("welcome");
		}
	}
}