package com.tnsf.inhertanceprog;

public class Student extends Citizen {
	private int rollno;
	private String collageName;
	public Student(int rollno, String collageName) {
		super();
		this.rollno = rollno;
		this.collageName = collageName;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, long adharano, String address, long phoneno) {
		super(name, adharano, address, phoneno);
		// TODO Auto-generated constructor stub
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollageName() {
		return collageName;
	}
	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	//@Override
	//public String toString() {
		//return "Student [rollno=" + rollno + ", collageName=" + collageName + "]";
	//}
	
	}
	
	
