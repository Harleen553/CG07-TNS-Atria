package com.tnsif.lambdaexpression;

@FunctionalInterface
abstract interface Draw{
	abstract void draw();
}

public class WithLambdaExample {

	public static void main(String[] args) {
		int width = 70;
		Draw d = ()->{System.out.println("drawing "+width);};
		d.draw();
	}

}
