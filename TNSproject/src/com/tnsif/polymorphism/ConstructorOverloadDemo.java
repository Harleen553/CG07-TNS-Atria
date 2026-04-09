package com.tnsif.polymorphism;

class Alpha {
	
	Alpha(){
		System.out.println("Deafult Con");
	}
	Alpha(int a, int b){
		System.out.println("2 int para");
	}
	Alpha(int a, int b, int c){
		System.out.println("3 int para");
	}
	Alpha(String name){
		System.out.println("1 string para");
	}
	Alpha(String name, int a){
		System.out.println("2 para str and int");
	}
}

public class ConstructorOverloadDemo {

	public static void main(String[] args) {
		Alpha a = new Alpha();
		Alpha a1 = new Alpha("Harry");
		Alpha a2 = new Alpha(10, 20);
		Alpha a3 = new Alpha(20, 30 , 40);
		Alpha a4 = new Alpha("Ram", 66);
	}
}
