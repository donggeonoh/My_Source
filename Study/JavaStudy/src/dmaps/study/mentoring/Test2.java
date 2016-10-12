package dmaps.study.mentoring;

public class Test2 {
	
	int num;
	double realNum;
	
	public Test2() {
		num = 0;
		realNum = 0;
	}
	
	public Test2(int num, float realNum) {
		this.num = num;
		this.realNum = realNum;
	}
	
	public void printNum() {
		System.out.println(num);
	}
	
	public void printRealNum() {
		System.out.println(realNum);
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setRealNum(float realNum) {
		this.realNum = realNum;
	}
	
	public double getRealNum() {
		return realNum;
	}
}
