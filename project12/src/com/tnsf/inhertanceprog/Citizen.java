package com.tnsf.inhertanceprog;

public class Citizen {
	private String name;
	private long adharano;
	private String address;
	private long phoneno;
	//default constructor 
	public Citizen() {
		super();
		
	}
	public Citizen(String name, long adharano, String address, long phoneno) {
		super();
		this.name = name;
		this.adharano = adharano;
		this.address = address;
		this.phoneno = phoneno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAdharano() {
		return adharano;
	}
	public void setAdharano(long adharano) {
		this.adharano = adharano;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", adharano=" + adharano + ", address=" + address + ", phoneno=" + phoneno
				+ "]";
	}

}
