package dmaps.study.mentoring3;

public class Launcher {
	public static void main(String[] args) {
		
		Monster monster = new Monster("이송원", 200, 10, 20);
		User user = new User("오동건", 100, 10, 10);
		
		while(true) {
			user.attack(monster);
			if(monster.checkHp()) break;
		
			monster.attack(user);
			if(user.checkHp()) break;
			
		}
		
	}
}
