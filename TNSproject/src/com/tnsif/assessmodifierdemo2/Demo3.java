package com.tnsif.assessmodifierdemo2;

import com.tnsif.accessmodifierdemo.PublicDemo;

public class Demo3 {

	public static void main(String args[]) {
		PublicDemo p=new PublicDemo();
		System.out.println(p.a);
		System.out.println(p.s);
		//System.out.println(p.str);
		p.display();

}
}
