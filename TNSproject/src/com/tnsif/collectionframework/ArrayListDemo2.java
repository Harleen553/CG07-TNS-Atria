package com.tnsif.collectionframework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		List<String> f = new ArrayList<> ();
		f.add("Apple");
		f.add("Mango");
		f.add("Daragon Fruit");
		//f.add(5);
		System.out.println(f);
		System.out.println(f.size());
		System.out.println(f.get(2));
		f.set(2, "Orange");
		System.out.println(f);
		f.remove(2);
		System.out.println(f);
		System.out.println(f.contains("apple")); // output :: true or false
		f.add("Orange");
		f.add("Pear");
		System.out.println(f);
		System.out.println();
		for (String fruit : f) {
			System.out.println(fruit);
		}
		
		//f.clear();
		System.out.println(f);
		System.out.println(f.isEmpty()); // output :: true or false
		System.out.println(f);
	}

}
