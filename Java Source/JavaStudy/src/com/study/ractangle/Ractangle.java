package com.study.ractangle;

public class Ractangle {
	
	private int x1, y1;
	private int x2, y2;
	
	public Ractangle(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public void inputDots(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public void distance() {
		int width = getWidth();
		int height = getHeight();
		
		System.out.println("°¡·Î : " + width);
		System.out.println("¼¼·Î : " + height);
	}
	
	public void extent() {
		int extent = getWidth() * getHeight();
		
		System.out.println("³ĞÀÌ : " + extent);
	}
	
	public int getWidth() {
		if(x2 > x1)
			return x2 - x1;
		
		return x1 - x2;
	}
	
	public int getHeight() {
		if(y2 > y1)
			return y2 - y1;
		
		return y1 - y2;
	}
}
