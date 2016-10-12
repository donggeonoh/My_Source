package com.dku.dmap.study.test.lotto;

import java.util.Arrays;

public class Main {
	public static void main(String [] args) {
		
		Lotto lotto = new Lotto();
		LottoSystem system = new LottoSystem();
		
		int [] arr = system.getNumbers();
		
		System.out.println("before");
		for (int i : arr) {
			System.out.println(i);
		}
		
		Arrays.sort(arr, 0, arr.length-1);
		System.out.println("after");
		for (int i : arr) {
			System.out.println(i);
		}
		/*
		int [] arr = {7,6,5,4,3,2,1};
		
		Arrays.sort(arr,0,6);
		
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
			
		*/
	}
}
