package gesfdfsd;

public class WaterPurifier {
	protected int waterVolum_cold;
	protected int waterVolum_hot;
	
	public WaterPurifier(int coldVolum, int hotVloum) {
		waterVolum_cold = coldVolum;
		waterVolum_hot = hotVloum;
	}
	
	void sayMyName() {
		System.out.println("나는 그냥 정수기 입니다.");
	}
	
	void swellCold() {
		if(waterVolum_cold < 0) {
			System.out.println("물이 없습니다.");
		} else {
			waterVolum_cold -= 1;
			System.out.println("찬물이 나옵니다. 남은 찬물 용량 : " + waterVolum_cold);
		}
	}
	
	void swellHot() {

		if(waterVolum_hot < 0) {
			System.out.println("물이 없습니다.");
		} else {
			waterVolum_hot -= 1;
			System.out.println("뜨거운물이 나옵니다. 남은 뜨거운물 용량 : " + waterVolum_hot);
		}
	}
}
