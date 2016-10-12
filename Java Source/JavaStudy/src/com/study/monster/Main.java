package com.study.monster;

public class Main {

	public static void main(String[] args) {
		
		User user = new User(500, 100, 30);
		Monster monster = new Monster(300, 50, 50);
		
		user.attack(monster);
		monster.attack(user);
	}

}
