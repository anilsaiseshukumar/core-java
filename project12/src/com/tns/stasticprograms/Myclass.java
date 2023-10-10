package com.tns.stasticprograms;
//program to demonstarate static method and block
public class Myclass {
	private int section;//instance variable
	private static int srno;//static variable
	//static block
	static {
		System.out.println(".....staticblock......");
		srno=1000;
	}
//defalt constructor
	Myclass() {
System.out.println("......defult constructor....");
srno++;
section++;
	}
//static method
static void display() {
	//System.out.println("section"+section);
	System.out.println("serialno"+srno);
	
}
@Override
public String toString() {
	return "Myclass [section=" + section + "]";
}
}