package dmaps.study.mentoring;

import java.awt.Frame;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		Frame f;
		f = new Frame();
		
		Test2 y = new Test2();
		Test2 x = new Test2(1, 5.3f);
		
		y.setNum(5);
		y.setRealNum(4.5f);
		x.setNum(3);
		
		System.out.println(y.getNum());
		
		y.printNum();
		y.printRealNum();
		x.printNum();
		x.printRealNum();
	}
}