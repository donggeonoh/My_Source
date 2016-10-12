package com.study.report4;

public class Unit {
	protected String name;
	protected int hp;
	protected int ap;
	protected int dp;
	
	public void attack(Unit user) {
		System.out.println(name + "��(��) �ش� Ÿ���� " + this.ap + "�� ���ݷ����� ���Ƚ��ϴ�.");
		user.beHit(ap, "");
	}
	
	public void beHit(int objectAp, String AttackType) {
		int hitPoint;
		
		switch (AttackType) {
		
		case "penetrate":
			hitPoint = objectAp;
			break;
		
		default:
			hitPoint = objectAp - this.dp;
		}
		
		this.hp -= hitPoint;
		
		if(this.hp < 0)
			this.hp = 0;
		
		System.out.println(this.name + "�� HP�� " + this.hp + "���ҽ��ϴ�.");
	}
	
	public boolean checkHealth(){
		if(hp == 0) return true;
		else		return false;
	}
}
