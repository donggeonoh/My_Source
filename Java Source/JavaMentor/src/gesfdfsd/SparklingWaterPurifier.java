package gesfdfsd;

public class SparklingWaterPurifier extends WaterPurifier
	implements Sparking{
	
	public SparklingWaterPurifier(int coldVolum, int hotVloum) {
		super(coldVolum, hotVloum);
	}

	@Override
	public void getSarkingWater() {
		System.out.println("ź����� ���ɴϴ�.");
	}
	
	@Override
	void sayMyName() {
		super.sayMyName();
		System.out.println("���� ����Ŭ�� ������ �Դϴ�.");
	}
}
