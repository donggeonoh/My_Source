package odg.practice.deck;

public class DeckTest {

	public static void main(String[] args) {
		Deck deck = new Deck();
		Card card = deck.pick(0);
		System.out.println(card);
		
		card = new Card(3, 1);
		System.out.println(card);
	}

}

class Deck {
	final int CARD_NUM = 52;
	Card card[] = new Card[CARD_NUM];
	
	public Deck() {
		int i = 0;
		
		for(int k = Card.KIND_MAX; k > 0; k--)
			for(int n = 0; n < Card.NUM_MAX; n++)
				card[i++] = new Card(k, n);
	}
	
	Card pick(int index) {
		return card[index];
	}
	
	Card pick() {
		int index = (int) (Math.random() * CARD_NUM);
		return pick(index);
	}
	
	void shuffle() {
		for(int i = 0; i < card.length; i++) {
			int r = (int) (Math.random() * CARD_NUM);
			
			Card temp = card[i];
			card[i] = card[r];
			card[r] = temp;
		}
	}
	
}

class Card {
	static final int KIND_MAX = 4;
	static final int NUM_MAX = 13;
	
	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	
	int kind;
	int number;
	
	public Card() {
		this(SPADE, 0);
	}
	
	public Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
		String[] number = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		
		return "kind : " + kinds[this.kind] + " number : " + number[this.number];
		
	}
	
}