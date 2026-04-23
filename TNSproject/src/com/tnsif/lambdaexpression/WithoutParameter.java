package com.tnsif.lambdaexpression;

interface Sayable{
	public String say();
}


public class WithoutParameter {
	public static void main(String[] args) {
		Sayable s = ()->{ return "I have nothing to say.";};
		System.out.println(s.say());
	}

}
