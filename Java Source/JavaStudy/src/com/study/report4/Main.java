package com.study.report4;

public class Main {

	public static void main(String[] args) {
		UserWarrior userWarrior = new UserWarrior("������", 500, 70, 30);
		MonsterGoblin monsterGoblin = new MonsterGoblin("���", 200, 50, 10);
		
		while(true) {
			userWarrior.choose(monsterGoblin);
			if(monsterGoblin.checkHealth()) break;
			monsterGoblin.attack(userWarrior);
			if(userWarrior.checkHealth()) break;
		}
	}
}