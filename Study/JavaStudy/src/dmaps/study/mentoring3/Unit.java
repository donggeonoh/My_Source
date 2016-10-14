package dmaps.study.mentoring3;

public class Unit {
	private String name;
	private int hp;
	private int dp;
	private int power;
	
	public void attack(Unit unit) {
		System.out.println(name + "��" + power + "�� ���ݷ����� ���ȴ�.");
		beHit(unit);
	}
	
	public void beHit(Unit unit) {
		unit.hp -= this.power - unit.dp;
		System.out.println(unit.name + "�� hp�� " + unit.hp + "�� ���Ҵ�.");
	}
	
	public boolean checkHp() {
		if(hp <= 0) return true;
		
		else return false;
	}
	
	public String getName() {
		
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getDefence() {
		return dp;
	}
	public void setDefence(int defence) {
		this.dp = defence;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	
}