package com.tnsif.finalkeyworddemo;

class Eco{
	void calculate() {
		System.out.println("base discount 10%");
	}
}

class Amazon extends Eco{
	@Override
	void calculate() {
		System.out.println("base discount 20%");
	}
}

public class FinalMethod {

	public static void main(String[] args) {
		Amazon a = new Amazon();
		a.calculate();

	}

}
