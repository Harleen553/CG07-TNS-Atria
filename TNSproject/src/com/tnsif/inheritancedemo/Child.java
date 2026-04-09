package com.tnsif.inheritancedemo;

public class Child extends Father {
	String cycle = "pink cycle";
	int money = 10000;
	
	void drink () {
		super.drink();
		System.out.println("child drinks coffee");
	}
	
	void read() {
		System.out.println("Java prog");
		System.out.println("Father earns "+ super.money);
	}
	
	public static void main(String[] args) {
		Child c = new Child();
		
		System.out.println("Child earns "+ c.money);
		c.drink();
		System.out.println(c.car);
		System.out.println(c.cycle);
		c.read();
	}
}
