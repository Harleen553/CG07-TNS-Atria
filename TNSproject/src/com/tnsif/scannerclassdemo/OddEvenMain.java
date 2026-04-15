package com.tnsif.scannerclassdemo;

import java.util.Scanner;

public class OddEvenMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		if (num%2 == 0)
			System.out.println("The number " +num+" is Even.");
		else
			System.out.println("The number " +num+ " is Odd.");
	}
}
