package dmaps.study.mentoring2;

public class Car extends Vehicle{
	private String name = "�ڵ���";
	int displacement; // ��ⷮ
	private int maxSpeed;
	private double zeroBack; // 100km �ӷ��� ���ʸ��� ��������
	public static int wheelSize; 
	
	//���� ������ ���
	public void printInfo() {
		System.out.println(getVihicle() + " : " + name);
		System.out.println("ž���ο� : " + this.getSeater());
		System.out.println("��ⷮ : " + displacement);
		System.out.println("�ְ��ӷ� : " + maxSpeed);
		System.out.println("���ι� : " + zeroBack + "��");
	}
	
	public int getDisplacement() {
		return displacement;
	}

	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public double getZeroBack() {
		return zeroBack;
	}

	public void setZeroBack(double zeroBack) {
		this.zeroBack = zeroBack;
	}
}