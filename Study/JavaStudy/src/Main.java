import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Calc calc = new Calc();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ���� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("�� ���� ����" + calc.add(num1, num2) + "�Դϴ�.");
	
	
	}
}