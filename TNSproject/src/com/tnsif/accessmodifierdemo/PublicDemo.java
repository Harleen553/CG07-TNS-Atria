package com.tnsif.accessmodifierdemo;

public class PublicDemo {
	public int a=9;
	public String s="Radah";
	private int b=10;
	protected String str="Happy";
	
	public void display() {
		System.out.println("welcome");
	}
	
	public static void main(String args[]) {
		PublicDemo p=new PublicDemo();
		System.out.println(p.a);
		System.out.println(p.s);
		System.out.println(p.b);
		System.out.println(p.str);
		p.display();
	}
}