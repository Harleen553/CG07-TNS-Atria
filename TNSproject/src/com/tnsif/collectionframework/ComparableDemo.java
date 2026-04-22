package com.tnsif.collectionframework;

import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person>{

	String name;
	int age;
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	void display() {
		System.out.println("Name: "+name+",\t Age: "+age);
	}
	
	@Override
	public int compareTo(Person o) {
		return this.name.compareTo(o.name);
	}
}

public class ComparableDemo {

	public static void main(String[] args) {
		ArrayList<Person> al = new ArrayList<>();
		al.add(new Person("John", 30));
		al.add(new Person("Sushma", 17));
		al.add(new Person("Rishi", 26));
		al.add(new Person("Harry", 76));
		
		Collections.sort(al);
		
		for (Person g:al) {
		g.display();
		}
		
	}

}
