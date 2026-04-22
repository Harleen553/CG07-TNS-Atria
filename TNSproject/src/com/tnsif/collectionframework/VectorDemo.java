package com.tnsif.collectionframework;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> s = new Vector<String>();
		s.add("A");
		s.add("b");
		s.add("f");
		s.add("e");
		s.add(null);
	
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(s.get(4));
		
		s.add(5,"rash");
		System.out.println(s);
		
		s.set(2, "Tulsi");
		System.out.println(s);
		System.out.println(s.capacity());
		System.out.println(s.contains("A"));
		System.out.println(s.indexOf("rash"));
		
		s.remove(0);
		System.out.println(s);
	}
}