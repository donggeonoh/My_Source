package com.study.report5;

/*�տ��� �������� �ڿ��� �������� ����� ����
 ���� ��Ī����� �Ѵ�.
 �� �ڸ� ���� ���� ���� �� �ִ� ��Ī ���� 91 * 99
 9009 �̴�. �� �ڸ� ���� ���� ���� �� �ִ� ����
 ū ���� ���ΰ�?*/

public class Palindrome {
	public static void main(String []args) {
		int threeDigitNumber1, threeDigitNumber2;
		
		for(int i = 999; i >= 100; i++)
			for(int j = 999; j >= 100; j++) {
				threeDigitNumber1 = i;
				threeDigitNumber2 = j;
				
				findPalindrome(threeDigitNumber1, threeDigitNumber2);
			}
		
	}

	private static void findPalindrome(int threeDigitNumber1, int threeDigitNumber2) {
		int multipleNumber = threeDigitNumber1 * threeDigitNumber2;
		int convertPalindromeNumber[] = new int[10];
		int roundedNumber = 10;
		
		for(int i = 0; i < 10; i++)
			convertPalindromeNumber[i] = -1;
		
		for(int i = 0; multipleNumber != 0 ;i++) {

			convertPalindromeNumber[i] = (multipleNumber % roundedNumber) / (roundedNumber / 10);
			multipleNumber -= (multipleNumber % roundedNumber);
			
			roundedNumber *= 10;
		}
		
		/*
		for(int i = 10; i > 0; i++) {
			int j = 0;
			
			if(convertPalindromeNumber[i] == -1) continue;
			
			if(convertPalindromeNumber[i] == convertPalindromeNumber[j])
		}
		*/
		
		System.out.println();
	}
}