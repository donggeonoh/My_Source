package com.study.report3;

public class FightMonster {
	Monster m[];
	
	FightMonster() {
		m = new Monster[2];
		m[0] = new Monster("오동건");
		m[1] = new Monster("신은총");
		
		m[0].status();
		m[1].status();
		
		System.out.println();
		
		while (true) {
			int randMatch1 = (int)(Math.random() * 2);
			int randMatch2 = (int)(Math.random() * 2);
			
			if(randMatch1 == randMatch2) continue;
			
			m[randMatch1].attackMonster(m[randMatch2]);
			System.out.println();
			
			if (m[randMatch1].deadTheMonster(m[randMatch2])) break;
			else if(m[randMatch2].deadTheMonster(m[randMatch1])) break;
		}
	}

}
