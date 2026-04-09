package com.tnsif.constructordemo;

import java.util.Scanner;

public class MainStu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Student name: ");
		String name = sc.next();
		
		System.out.println("Enter student rollno: ");
		int rollno = sc.nextInt();
		
		System.out.println("Enter student clg name: ");
		String CName = sc.next();
		
		Student s = new Student();
		s.setName(name);
		s.setRollno(rollno);
		s.setCName(CName);
		
		System.out.println(s);

	}

}
