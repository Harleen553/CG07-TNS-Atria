package com.tnsif.collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person1 {
	String name;
	int age;
	
	public Person1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	void display() {
		System.out.println("Name: "+name+",\t Age: "+age);
	}
}
//sort by name

class NameComparator implements Comparator<Person1>{

	@Override
	public int compare(Person1 o1, Person1 o2) {
		
		return o1.name.compareTo(o2.name);
	}
}
//sort by age

class AgeComparator implements Comparator<Person1>{

	@Override
	public int compare(Person1 o1, Person1 o2) {
		
		return Integer.compare(o1.age, o2.age);
	}
}

public class ComparatorDemo {

	public static void main(String[] args) {
		ArrayList<Person1> p = new ArrayList<Person1>();
		
		p.add(new Person1("Rashmi", 26));
		p.add(new Person1("Kusuma", 20));
		p.add(new Person1("Rishi", 16));
		p.add(new Person1("Harry", 32));
		p.add(new Person1("Nidhi", 54));
		
		Collections.sort(p, new NameComparator());
		System.out.println("sort by name");
		for (Person1 p1:p) {
			p1.display();
		}
		System.out.println("----------------------------------");
		Collections.sort(p, new AgeComparator());
		System.out.println("sort by age");
		for (Person1 p2:p) {
			p2.display();
		}	
	}
}