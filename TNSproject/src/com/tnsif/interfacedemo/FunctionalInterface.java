package com.tnsif.interfacedemo;

interface Alpha{
	void element();
}

class Beta implements Alpha{

	@Override
	public void element() {
		System.out.println("Hello from elements Alpha");
		
	}
	
}

public class FunctionalInterface {

	public static void main(String[] args) {
		Beta b = new Beta();
		b.element();
	}
}
