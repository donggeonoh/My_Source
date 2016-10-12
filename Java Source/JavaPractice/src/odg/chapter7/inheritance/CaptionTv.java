package odg.chapter7.inheritance;

public class CaptionTv extends Tv{
	boolean caption;
	
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
	
	@Override
	CaptionTv power() {
		super.power();
		
		return this;
	}
}