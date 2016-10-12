package com.study.report2;

public class MaxNum {

	public static void main(String[] args) {
		int [] num = new int[7];
		
		randNum(num);
		System.out.println("최댓값 : " + maxNum(num));
	}

	static void randNum(int num[])
	{
		for(int i = 0; i < num.length; i++)
			num[i] = (int) (Math.random() * 100 + 1);
	}
	
	static int maxNum(int num[])
	{
		int max = num[0];
		
		for(int i = 1; i < num.length; i++)
		{
		//	System.out.println(i + "번째 값 : " + num[i]);
			if(max < num[i])
				max = num[i];
		}
		
		return max;
	}
}
