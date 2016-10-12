package ssssss;

import java.util.ArrayList;

public class SCV {

	public static void main(String [] ars) {
		ArrayList<String> list = new ArrayList<>();
		
		for(int i=0; i<10; i++) {
			list.add("" + i);
		}
		
		
		for (String string : list) {
			System.out.println("list ³»¿ë¹° : " + string);
		}
		
	}
}
