package gesfdfsd;

public class IceWarterPurifier extends WaterPurifier
	implements Ice {
	public IceWarterPurifier(int coldVolum, int hotVloum) {
		super(coldVolum, hotVloum);
	}

	@Override
	public void getIce() {
		System.out.println("������ ���ɴϴ�.");
	}
	
	@Override
	void sayMyName() {
		System.out.println("���� ������ ������ ������ �Դϴ�.");
	}
}
