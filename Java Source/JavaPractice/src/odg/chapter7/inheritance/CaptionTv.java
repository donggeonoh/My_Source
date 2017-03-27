package odg.chapter7.inheritance;

import java.util.Scanner;

public class CaptionTv extends Tv{
	boolean caption;
	Scanner sc = new Scanner(System.in);
	
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
			sc.next();
		}
	}
	
	@Override
	CaptionTv power() {
		super.power();
		
		return this;
	}
}