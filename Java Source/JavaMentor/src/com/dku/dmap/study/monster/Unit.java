package com.dku.dmap.study.monster;

public class Unit {
	protected int hp;
	protected int ap;
	protected int dp;
	
	public void attack(Unit user) {
		System.out.println("자기가 해당 타켓을" + this.ap + "의 공격력으로 때렸습니다.");
		int userHp = user.beHit(ap);
		System.out.println("해당 타켓의 hp가 " + userHp + "남았습니다.");
	}
	
	public int beHit(int objectAp) {
		int hitPoint = objectAp - this.dp;
		
		if(hitPoint < 0)
			hitPoint = 0;
		
		this.hp -= hitPoint;
		return this.hp;
	}
}
