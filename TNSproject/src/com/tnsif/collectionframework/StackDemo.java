package com.tnsif.collectionframework;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		
		s.push(0);
		s.push(2);
		s.push(4);
		s.push(6);
		s.push(8);
		s.push(9);
		s.push(3);
		
		System.out.println(s);
		for (int d:s) {
			System.out.println(d);
		}
		
		System.out.println("this is the top most element : "+s.peek());
		System.out.println("index: "+s.search(6));
		s.pop();
		s.pop();
		System.out.println(s);
		
	}

}
