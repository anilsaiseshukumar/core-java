package com.tns.constructorprog;

import java.util.Scanner;

public class Classdemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name,city;
		int id;
		System.out.println("enter the customer id");
		id=sc.nextInt();
		System.out.println("enter name");
		name=sc.nextLine();
		System.out.println("enter city");
		city=sc.nextLine();
		Customer c1=new Customer();
		c1.setCustomerID(id);
		c1.setCustomerName(name);
		c1.setCustomerCity(city);
		System.out.println(c1);
	}
}
