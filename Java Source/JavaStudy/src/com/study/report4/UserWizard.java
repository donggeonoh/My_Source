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
		System.out.println(name + "��(��) �Ҳ� ��ų�� ����Ͽ����ϴ�.");
		unit.beHit(mp, "");
	}
	
	public void blizzard(Unit unit) {
		System.out.println(name + "��(��) ������ ��ų�� ����Ͽ����ϴ�.");
		unit.beHit(mp * 2, "");
	}
	
	public void penetrateAttack(Unit unit) {
		System.out.println(name + "��(��) ���� ���� ���ݽ�ų�� ����Ͽ����ϴ�.");
		unit.beHit(mp, "penetrate");
	}
}
