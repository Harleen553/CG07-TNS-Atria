package com.tnsif.statickeyworddemo;

class Student{
	String name;
	int id;
	static String CName="Atria";
	
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	void showdetails() {
		System.out.println("Student: "+name + "\t   id: "+id+"\t  College Name: "+CName);
	}
}

public class StaticVariableDemo {

	public static void main(String[] args) {
		Student s = new Student("Guru", 1);
		Student s1 = new Student("Rahul", 3);
		Student s2 = new Student("Prajwal", 5);
		Student s3 = new Student("Harry", 7);

		s.showdetails();
		s1.showdetails();
		s2.showdetails();
		s3.showdetails();
	}

}
