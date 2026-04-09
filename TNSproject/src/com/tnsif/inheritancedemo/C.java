package com.tnsif.inheritancedemo;

public class C extends B {
	int c = 30;
	String name3 = "Liki";
	
	void read3() {
		System.out.println("Class C");
	}
	
	public static void main(String args[]) {
		C c = new C();
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println(c.c);
		c.read();
		c.read2();
		c.read3();
		
		System.out.println(c.name);
		System.out.println(c.name2);
		System.out.println(c.name3);
	}
}
