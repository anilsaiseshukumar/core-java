package com.tns.markerinterface;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s= new Student(1,"Anil");
		if (s instanceof Regestrable)
			System.out.println("Student registred");
		else
			System.out.println("Student not registred");
	}

}
