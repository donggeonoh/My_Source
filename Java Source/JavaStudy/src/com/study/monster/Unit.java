package com.study.monster;

public class Unit {
	protected String name;
	protected int hp;
	protected int ap;
	protected int dp;

	public void attack(Unit unit) {
		System.out.println("몬스터가 유저를 " + ap + "의 공격력으로 공격 하였습니다.");
		unit.beHit(ap);
	}
	
	public int beHit(int objectAp) {
		System.out.println(name + "은(는) " + hp + "Hp 가 남았습니다.");
		
		return this.hp -= objectAp;
	}
}