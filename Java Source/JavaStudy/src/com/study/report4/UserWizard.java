package com.study.report4;

public class UserWizard extends User{
	protected int mp;

	public UserWizard(String name, int hp, int ap, int mp, int dp) {
		this.name = name;
		this.hp = hp;
		this.ap = ap;
		this.mp = mp;
		this.dp = dp;
	}
	
	public void Firestorm(Unit unit) {
		System.out.println(name + "은(는) 불꽃 스킬을 사용하였습니다.");
		unit.beHit(mp, "");
	}
	
	public void blizzard(Unit unit) {
		System.out.println(name + "은(는) 눈보라 스킬을 사용하였습니다.");
		unit.beHit(mp * 2, "");
	}
	
	public void penetrateAttack(Unit unit) {
		System.out.println(name + "은(는) 관통 마법 공격스킬을 사용하였습니다.");
		unit.beHit(mp, "penetrate");
	}
}
