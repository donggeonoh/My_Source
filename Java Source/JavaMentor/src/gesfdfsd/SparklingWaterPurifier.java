package gesfdfsd;

public class SparklingWaterPurifier extends WaterPurifier
	implements Sparking{
	
	public SparklingWaterPurifier(int coldVolum, int hotVloum) {
		super(coldVolum, hotVloum);
	}

	@Override
	public void getSarkingWater() {
		System.out.println("탄산수가 나옵니다.");
	}
	
	@Override
	void sayMyName() {
		super.sayMyName();
		System.out.println("나는 스파클링 정수기 입니다.");
	}
}
