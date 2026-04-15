package com.tnsif.abstractiondemo;

abstract class Demo{
	public void calling() {
		System.out.println("calling method from class Demo");
	}
	public abstract void AllIntegration(); 
	public abstract void Satelitedemo();
	public abstract void healthmonitoring();	
}

 class Test1 extends Demo{
	@Override
	public void AllIntegration() {
		System.out.println("Welcome to AllIntegration method");		
	}
	@Override
	public void Satelitedemo() {
		System.out.println("welcome to python");	
	}
	@Override
	public void healthmonitoring() {
		System.out.println("welcome to ai healthCare");		
	}
}


public class AbstractDemo {

	public static void main(String[] args) {
		Test1 t=new Test1();
		t.AllIntegration();
		t.healthmonitoring();
		t.Satelitedemo();	
	}

}
