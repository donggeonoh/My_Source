package com.study.report3;

public class Monster {
	private String name;
	private int hp;
	private int hpMAX;
	private int offense;
	private int defense;
	
	Monster(String _name) {
	name = _name;
	hpMAX = (int)(Math.random() * 20 + 50);
	hp = hpMAX;
	}
	
	public void status() {
		System.out.println(name + "�� HP : " + hp + "/" + hpMAX);
	}
	
	public void attackMonster(Monster monster) {
		setOffense();
		monster.setDefense();

		if(offense == monster.getDefense())
			blockAttack(monster);
		
		else if(offense < monster.getDefense())
			reflectAttack(monster);

		else
			justAttack(monster);
	}
	
	public void blockAttack(Monster monster) {
		displayAttack();
		System.out.print(monster.getName() + " ���ʹ� ������ ���Ƴ�����! ");
		monster.displayHP();
		monster.displayDefense();
	}
	
	public void reflectAttack(Monster monster) {
		displayAttack();
		System.out.println(monster.getName() +" ���ʹ� " + (monster.getDefense() - offense) + "�������� �ݻ� �Ͽ���! ");
		
		setCalculationOfDamages(-(monster.getDefense() - offense));
		
		System.out.print(name);
		displayHP();
		System.out.println();
		System.out.print(monster.getName());
		monster.displayHP();
		monster.displayDefense();
	}
	
	public void justAttack(Monster monster) {
		displayAttack();
		System.out.print(monster.getName() + " ���ʹ� " + (offense - monster.getDefense()) +"�������� �Ծ���. ");
		
		monster.setCalculationOfDamages(-(offense - monster.getDefense()));

		monster.displayHP();
		monster.displayDefense();
	}
	
	public void displayAttack() {
		System.out.println(name + " ���ʹ�" + offense + "�������� �־���! ");
	}
	
	public void displayDefense() {
		System.out.println(" ���� : " + defense);
	}
	
	public void displayHP() {
		if(hp < 0) hp = 0;
		
		System.out.print(" HP : " +hp + "/" + hpMAX);
	}
	
	public boolean deadTheMonster(Monster monster) {
		if(hp == 0) {
			System.out.println(name + " ���Ͱ� �׾����ϴ�.");
			System.out.println(monster.getName() + "�� ���� hp : " + monster.getHp() + "/" + monster.getHpMAX());
			System.out.println(monster.getName() +" �¸�!!!");
			
			return true;
		}
		
		return false;
	}
	
	public String getName() {
		return name;
	}
	
	public int getHpMAX() {
		return hpMAX;
	}
	
	public int getHp() {
		return hp;
	}
	
	public void setHp(int _hp) {
		hp = _hp;
	}
	
	public int getOffense() {
		return offense;
	}

	public void setOffense() {
		offense = (int)(Math.random() * 6 + 5);
	}
	
	public int getDefense() {
		return defense;
	}

	public void setDefense() {
		defense = (int)(Math.random() * 7 + 1);
	}
	
	public void setCalculationOfDamages(int damage) {
		hp += damage;
	}
}
