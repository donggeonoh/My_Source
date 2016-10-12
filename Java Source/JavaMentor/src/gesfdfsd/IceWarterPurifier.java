package gesfdfsd;

public class IceWarterPurifier extends WaterPurifier
	implements Ice {
	public IceWarterPurifier(int coldVolum, int hotVloum) {
		super(coldVolum, hotVloum);
	}

	@Override
	public void getIce() {
		System.out.println("얼음이 나옵니다.");
	}
	
	@Override
	void sayMyName() {
		System.out.println("나는 얼음이 나오는 정수기 입니다.");
	}
}
