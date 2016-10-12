package odg.chapter7.inheritance;

public class Tv {
	boolean power;
	int channel;
	
	Tv power() {	power = !power;	return this; }
	void channelup() {	++channel;	}
	void channeldown() {	--channel;	}
	
}