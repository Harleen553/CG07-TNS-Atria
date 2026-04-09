package com.tnsif.encapsulationdemo;

class Human1 {
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class EncapsulationProgram {
	public static void main(String[] args) {
		Human1 h = new Human1();
		h.setAge(21);
		h.setName("Rahul");
		
		System.out.print("Age : " + h.getAge());
		System.out.println(", Name : " + h.getName());
		
		h.setAge(16);
		h.setName("Guru");
		
		System.out.print("Age : " + h.getAge());
		System.out.println(", Name : " + h.getName());
		
		

	}

}
