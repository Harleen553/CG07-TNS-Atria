package com.tnsif.statickeyworddemo;

class Paymentgateway{
	static void shownotification() {
		System.out.println("supported banck: sbi, axis, ...");
	}
}

public class StaticMethod {

	public static void main(String[] args) {
	 Paymentgateway.shownotification();

	}

}
