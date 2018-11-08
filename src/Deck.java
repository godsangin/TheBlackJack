import java.util.ArrayList;

public class Deck {
	ArrayList<Card> cards;
	final String[] shapes = {"Heart", "Clova", "Spade", "Diamond"};
	public Deck() {//4개모양의 카드로 총 52개의 덱 설정
		cards = new ArrayList<>();
		for(int i = 1; i < 14; i++) {
			for(int j = 0; j < shapes.length; j++) {
				Card card = new Card(shapes[j], i);
				cards.add(card);
			}
		}
	}
	
	public void suffle() {
		for(int i = 0; i < 52; i++) {
			int index1 = (int)(Math.random() * 52);
			int index2 = (int)(Math.random() * 52);
			swap(index1, index2);
		}
	}
	
	public void swap(int index1, int index2) {
		Card temp = cards.get(index1);
		cards.set(index1, cards.get(index2));
		cards.set(index2, temp);
	}
	
	public Card draw() {
		return (Card)cards.remove(cards.size() - 1);
	}
}
