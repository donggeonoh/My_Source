package com.study.monster;

public class Unit {
	protected String name;
	protected int hp;
	protected int ap;
	protected int dp;

	public void attack(Unit unit) {
		System.out.println("���Ͱ� ������ " + ap + "�� ���ݷ����� ���� �Ͽ����ϴ�.");
		unit.beHit(ap);
	}
	
	public int beHit(int objectAp) {
		System.out.println(name + "��(��) " + hp + "Hp �� ���ҽ��ϴ�.");
		
		return this.hp -= objectAp;
	}
}