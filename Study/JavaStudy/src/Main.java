import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Calc calc = new Calc();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 수를 입력하세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("두 수의 합은" + calc.add(num1, num2) + "입니다.");
	
	
	}
}