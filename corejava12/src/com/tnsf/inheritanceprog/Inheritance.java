package com.tnsf.inheritanceprog;
class parent{
	int var=100;
}
public class Inheritance {
	int var=50;
	void display() {

		System.out.println("the values is"+var);
		System.out.println("the values is"+ super.var);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
