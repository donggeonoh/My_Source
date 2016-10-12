package com.study.report4;
import java.util.Scanner;

public class UserWarrior extends User{

	private Scanner sc;

	public UserWarrior(String name, int hp, int ap, int dp) {
		this.name = name;
		this.hp = hp;
		this.ap = ap;
		this.dp = dp;
	}
	
	public void choose(Unit unit) {
		int num = inputNumber();
		
		if(num == 0)
			attack(unit);
		
		else if(num == 1)
			skills(unit);
	}
	
	public void skills(Unit unit) {
		int input;
		sc = new Scanner(System.in);
		
		System.out.print("1.���Ӱ��� 2.��ȭ���� 3.������� : ");
		input = sc.nextInt();
		
		switch(input) {
		case 1:
			multiAttack(unit);
			break;
			
		case 2:
			finalAttack(unit);
			break;
			
		case 3:
		penetrateAttack(unit);
		}
	}
	
	public void multiAttack(Unit unit) {
		System.out.println(name + "��(��) ���Ӱ��� ��ų�� ����Ͽ����ϴ�.");
		for(int i = 0; i < 3; i++) unit.beHit(this.ap, "");
	}
	
	public void finalAttack(Unit unit) {
		System.out.println(name + "��(��) ��ȭ���� ��ų�� ����Ͽ����ϴ�. ");
		unit.beHit(3 * ap, "");
	}
	
	public void penetrateAttack(Unit unit) {
		System.out.println(name + "��(��) ������� ��ų�� ����Ͽ����ϴ�.");
		unit.beHit(ap, "penetrate");
	}
}