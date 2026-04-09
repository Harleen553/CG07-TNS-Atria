package com.tnsif.accessmodifierdemo;

public class Demo2 {

	public static void main(String args[]) {
		PublicDemo p=new PublicDemo();
		System.out.println(p.a);
		System.out.println(p.s);
		//System.out.println(p.b);
		System.out.println(p.str);
		p.display();

}
}