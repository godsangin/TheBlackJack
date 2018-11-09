import java.util.ArrayList;

public class Dealer{
	ArrayList<Card> hands;
	String name;
	static Dealer dealer;
	public static Dealer newInstance(Card card, String name) {
		dealer = new Dealer(card, name);
		
		return dealer;
	}
	
	private Dealer(Card card, String name) {
		this.hands = new ArrayList<>();
		this.name = name;
		
		hands.add(card);
	}
	
	public int hit(Deck deck) {//카드를 받는다
		int sum = getScores();
		if(sum > 16) {//17이상일 경우 딜러는 카드를 더 받을 수 없다
			System.out.println("Dealer can't get a card anymore!");
			return sum;
		}
		Card card = deck.draw();
		hands.add(card);
		sum = getScores();
		if(sum > 21) {
			return -1;
		}
		return sum;
	}
	
	private int getScores() {//점수의 합계 계산
		int val = 0;
		for(int i = 0; i < hands.size(); i++) {
			val += hands.get(i).getNum();
		}
		return val;
	}
}
