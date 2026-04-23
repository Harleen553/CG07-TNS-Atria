package com.tnsif.lambdaexpression;

interface Demo{
	String say(String message);
}

public class WithParameter {
	public static void main(String[] args) {
		Demo d = (message)->{
			String s1 = "I would like to drink a cup of coffee.";
			String s2 = " With a plate of cake";
			String s4 = s1 + s2;
			String s3 = s4+message;
			return s3;
		};
		System.out.println(d.say(", please!"));
	}

}
