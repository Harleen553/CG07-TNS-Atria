package com.tnsif.polymorphism;

class Father {
	int a =9;
	void drink() {
		System.out.println("Tea");
	}
}

class Son extends Father {
	@Override
	void drink() {
		System.out.println("coffee");
	}
}

public class MethodOverridingDemo {

	public static void main(String[] args) {
		Son son = new Son();
		son.drink();
	}
}
