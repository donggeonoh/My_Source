package com.dku.dmap.study;

public class Persen {
	String name;
	boolean gender;
	
	public Persen(String _name, boolean _gender) {
		name = _name;
		gender = _gender;
	}
	
	void run() {
		System.out.println(name + " �޸���.");
	}
	
	void sayMyName() {
		System.out.println(name + "�Դϴ�");
	}
	
	public static void main(String [] args) {
		Persen choiGunHee = new Persen("�ְ���", true);
		choiGunHee.sayMyName();
		choiGunHee.run();
	}
}
