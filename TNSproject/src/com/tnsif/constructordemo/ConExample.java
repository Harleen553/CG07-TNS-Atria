package com.tnsif.constructordemo;

public class ConExample {
	
	ConExample(){
		System.out.println("Default con");
	}
	ConExample(int a, String b){
		System.out.println("2 para con");
	}
	ConExample(int r){
		System.out.println("1 para con");
	}
	ConExample(int s, int b, int d){
		System.out.println("3 para con");
	}
	
	public static void main(String args[]) {
		ConExample c = new ConExample();
		ConExample c1 = new ConExample(1);
		ConExample c2 = new ConExample(10, "happy");
		ConExample c3 = new ConExample(20, 30 , 40);
		ConExample c4 = new ConExample(50, "Ram");
	}
}
