package gesfdfsd;

public class WaterPurifier {
	protected int waterVolum_cold;
	protected int waterVolum_hot;
	
	public WaterPurifier(int coldVolum, int hotVloum) {
		waterVolum_cold = coldVolum;
		waterVolum_hot = hotVloum;
	}
	
	void sayMyName() {
		System.out.println("���� �׳� ������ �Դϴ�.");
	}
	
	void swellCold() {
		if(waterVolum_cold < 0) {
			System.out.println("���� �����ϴ�.");
		} else {
			waterVolum_cold -= 1;
			System.out.println("������ ���ɴϴ�. ���� ���� �뷮 : " + waterVolum_cold);
		}
	}
	
	void swellHot() {

		if(waterVolum_hot < 0) {
			System.out.println("���� �����ϴ�.");
		} else {
			waterVolum_hot -= 1;
			System.out.println("�߰ſ�� ���ɴϴ�. ���� �߰ſ �뷮 : " + waterVolum_hot);
		}
	}
}
