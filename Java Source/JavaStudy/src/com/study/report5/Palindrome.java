package com.study.report5;

/*앞에서 읽을때나 뒤에서 읽을때나 모양이 같은
 수를 대칭수라고 한다.
 두 자리 수를 곱해 만들 수 있는 대칭 수는 91 * 99
 9009 이다. 세 자리 수를 곱해 만들 수 있는 가장
 큰 수는 얼마인가?*/

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