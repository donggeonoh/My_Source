package com.study.practice;

public class Humen {
	String name;
	boolean gender;
	
	public Humen(String _name, boolean _gender) {
		name = _name;
		gender = _gender;
	}
	
	void run() {
		System.out.println(name + " �޸���.");
	}
	
	void myName() {
		System.out.println(name + " �Դϴ�.");
	}
	
	public static void main(String[] args) {
		Humen odg = new Humen("������", true);
		odg.name = "������";
		odg.myName();
		odg.run();
	}
}
