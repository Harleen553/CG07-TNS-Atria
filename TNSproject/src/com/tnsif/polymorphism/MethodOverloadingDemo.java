package com.tnsif.polymorphism;

class Calculator{
	
	int add(int a, int b, int c) {
		return a+b+c;
	}
	
	int add(int a, int b) {
		return a+b;
	}
	
	double add(double a, double b, double c) {
		return a+b+c;
	}
	
	double add(double a, double c) {
		return a+c;
	}
	
}


public class MethodOverloadingDemo {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.add(1, 3));
		System.out.println(cal.add(1, 4, 6));
		System.out.println(cal.add(4.8, 6.2));
		System.out.println(cal.add(1.89, 4.54, 6.77));

	}

}
