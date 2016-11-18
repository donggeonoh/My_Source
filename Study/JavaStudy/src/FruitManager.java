import java.util.Scanner;

public class FruitManager {
	
	Scanner scan = new Scanner(System.in);
	
	String fruit;
	
	String apple = "사과";
	int applePrice = 2000;
	int appleCount;
	
	String pear = "배";
	int pearPrice = 1500;
	int pearCount;
	
	String orange = "오렌지";
	int orangePrice = 1700;
	int orangeCount;
	
	public void selectMenu(int selectMenu) {
		
		switch(selectMenu) {
		case 1:
			System.out.println("과일을 입력하시오.(사과, 배, 오렌지)");
			fruit = scan.next();
			if(fruit.equals("사과")){
				System.out.println("개수를 입력하세요");
				appleCount = scan.nextInt();}
			else if(fruit.equals("배")){
				System.out.println("개수를 입력하세요");
				pearCount = scan.nextInt();}
			else if(fruit.equals("오렌지")){
				System.out.println("개수를 입력하세요");
				orangeCount = scan.nextInt();}
			break;
		case 2:
			if(fruit.equals("사과"))
				System.out.println("사과,"+ appleCount+"개");
			else if(fruit.equals("배"))
				System.out.println("배,"+ pearCount+"개");
			else if(fruit.equals("오렌지"))
				System.out.println("오렌지,"+ orangeCount+"개");
			break;
		case 3:
			if(fruit.equals("사과"))
				System.out.println(applePrice*appleCount);
			else if(fruit.equals("배"))
				System.out.println(pearPrice*pearCount);
			else if(fruit.equals("오렌지"))
				System.out.println(orangePrice*orangeCount);
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
}
