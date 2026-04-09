package com.tnsif.scannerclassdemo;

import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the person name: ");
		String name = sc.next();
		System.out.println("Enter the income: ");
		int income = sc.nextInt();
		
		Person pp = new Person();
		pp.setName(name);
		pp.setIncome(income);
		
		TaxCalculation t = new TaxCalculation();
		t.CalculateTax(pp);
		
		System.out.println("After tax calculatiion: ");
		System.out.println(pp);
		
	}

}
