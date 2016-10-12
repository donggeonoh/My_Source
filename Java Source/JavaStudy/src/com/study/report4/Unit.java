package com.study.report4;

public class Unit {
	protected String name;
	protected int hp;
	protected int ap;
	protected int dp;
	
	public void attack(Unit user) {
		System.out.println(name + "이(가) 해당 타켓을 " + this.ap + "의 공격력으로 때렸습니다.");
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
		
		System.out.println(this.name + "의 HP가 " + this.hp + "남았습니다.");
	}
	
	public boolean checkHealth(){
		if(hp == 0) return true;
		else		return false;
	}
}
