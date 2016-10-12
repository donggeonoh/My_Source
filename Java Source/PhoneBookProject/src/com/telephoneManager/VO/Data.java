package com.telephoneManager.VO;

public class Data {
	
	public final static boolean MEN = true;
	public final static boolean WOMEN = false;
	
	private String name;
	private boolean gender;
	private String phoneNumber;
	private String address;
	
	public Data(String _name, boolean _gender, String _phoneNumber, String _address) {
		this.name = _name;
		this.gender = _gender;
		this.phoneNumber = _phoneNumber;
		this.address = _address;	
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String isGender() {
		if(gender == true)
			return "남자";
		
		else
			return "여자";
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
	
	@Override
	public String toString() {
		return "이름 : " + name + "\t" + " 성 : " + isGender() + "\t" + " 전화번호 : " + phoneNumber + "\t" + " 주소 : " + address;
	}
	
}
