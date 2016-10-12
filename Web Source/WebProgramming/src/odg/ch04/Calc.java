package odg.ch04;

public class Calc {
	
	private int num1;
	private int num2;
	private String op;
	
	public Calc(int num1, int num2, String op) {
		this.num1 = num1;
		this.num2 = num2;
		this.op = op;
	}
	
	public double getResult() {
		double result = 0;

		if(op.equals("+"))
			result = num1 + num2;
		
		else if(op.equals("-"))
			result = num1 - num2;
		
		else if(op.equals("*"))
			result = num1 * num2;
		
		else if(op.equals("/"))
			result = num1 / num2;
		
		return result;
	}
	
}