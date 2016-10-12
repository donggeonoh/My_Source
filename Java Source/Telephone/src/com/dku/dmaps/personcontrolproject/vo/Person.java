package com.dku.dmaps.personcontrolproject.vo;

public class Person {
	public static final boolean MEN = true;
	public static final boolean WOMEN = false;
	
	private String name;
	private boolean gender;
	private String phoneNumber;
	private String address;
	
	
	
	public Person(String _name, boolean _gender, String _phoneNumber, String _address) {
		this.name = _name;
		this.gender = _gender;
		this.phoneNumber = _phoneNumber;
		this.address = _address;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", phoneNumber=" + phoneNumber + ", address=" + address
				+ "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isGender() {
		return gender;
	}
	
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
