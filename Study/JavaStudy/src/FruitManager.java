import java.util.Scanner;

public class FruitManager {
	
	Scanner scan = new Scanner(System.in);
	
	String fruit;
	
	String apple = "���";
	int applePrice = 2000;
	int appleCount;
	
	String pear = "��";
	int pearPrice = 1500;
	int pearCount;
	
	String orange = "������";
	int orangePrice = 1700;
	int orangeCount;
	
	public void selectMenu(int selectMenu) {
		
		switch(selectMenu) {
		case 1:
			System.out.println("������ �Է��Ͻÿ�.(���, ��, ������)");
			fruit = scan.next();
			if(fruit.equals("���")){
				System.out.println("������ �Է��ϼ���");
				appleCount = scan.nextInt();}
			else if(fruit.equals("��")){
				System.out.println("������ �Է��ϼ���");
				pearCount = scan.nextInt();}
			else if(fruit.equals("������")){
				System.out.println("������ �Է��ϼ���");
				orangeCount = scan.nextInt();}
			break;
		case 2:
			if(fruit.equals("���"))
				System.out.println("���,"+ appleCount+"��");
			else if(fruit.equals("��"))
				System.out.println("��,"+ pearCount+"��");
			else if(fruit.equals("������"))
				System.out.println("������,"+ orangeCount+"��");
			break;
		case 3:
			if(fruit.equals("���"))
				System.out.println(applePrice*appleCount);
			else if(fruit.equals("��"))
				System.out.println(pearPrice*pearCount);
			else if(fruit.equals("������"))
				System.out.println(orangePrice*orangeCount);
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
	
}
