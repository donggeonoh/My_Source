package com.dku.dmap.study.monster;

public class Unit {
	protected int hp;
	protected int ap;
	protected int dp;
	
	public void attack(Unit user) {
		System.out.println("�ڱⰡ �ش� Ÿ����" + this.ap + "�� ���ݷ����� ���Ƚ��ϴ�.");
		int userHp = user.beHit(ap);
		System.out.println("�ش� Ÿ���� hp�� " + userHp + "���ҽ��ϴ�.");
	}
	
	public int beHit(int objectAp) {
		int hitPoint = objectAp - this.dp;
		
		if(hitPoint < 0)
			hitPoint = 0;
		
		this.hp -= hitPoint;
		return this.hp;
	}
}
