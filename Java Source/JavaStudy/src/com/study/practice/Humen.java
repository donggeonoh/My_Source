package com.study.practice;

public class Humen {
	String name;
	boolean gender;
	
	public Humen(String _name, boolean _gender) {
		name = _name;
		gender = _gender;
	}
	
	void run() {
		System.out.println(name + " 달린다.");
	}
	
	void myName() {
		System.out.println(name + " 입니다.");
	}
	
	public static void main(String[] args) {
		Humen odg = new Humen("오동건", true);
		odg.name = "오동건";
		odg.myName();
		odg.run();
	}
}
