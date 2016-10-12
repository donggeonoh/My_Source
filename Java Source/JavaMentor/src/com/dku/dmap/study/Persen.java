package com.dku.dmap.study;

public class Persen {
	String name;
	boolean gender;
	
	public Persen(String _name, boolean _gender) {
		name = _name;
		gender = _gender;
	}
	
	void run() {
		System.out.println(name + " 달린다.");
	}
	
	void sayMyName() {
		System.out.println(name + "입니다");
	}
	
	public static void main(String [] args) {
		Persen choiGunHee = new Persen("최건희", true);
		choiGunHee.sayMyName();
		choiGunHee.run();
	}
}
