package gesfdfsd;

import java.util.ArrayList;

public class Main {
	public static void main(String [] args) {
		ArrayList<WaterPurifier> list = new ArrayList<WaterPurifier>();
		
		list.add(new WaterPurifier(100, 100));
		list.add(new SparklingWaterPurifier(100, 100));
		list.add(new IceWarterPurifier(100, 100));
		
		for (WaterPurifier waterPurifier : list) {
			waterPurifier.sayMyName();
			waterPurifier.swellCold();
			
			if( waterPurifier instanceof SparklingWaterPurifier) {
				((SparklingWaterPurifier) waterPurifier).getSarkingWater();
			}
		}
		
		
	}
}
