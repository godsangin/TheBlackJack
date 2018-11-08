import java.util.ArrayList;

public class Player {
	ArrayList<Card> hands;
	String playerName;
	public Player(Card card, String playerName) {
		this.hands = new ArrayList<>();
		hands.add(card);
		this.playerName = playerName;
	}
	
	public int hit(Deck deck) {//카드를 받는다
		Card card = deck.draw();
		hands.add(card);
		int sum = getScores();
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
	
	public void split() {//한 플래이어가 패를 두개로 나눈다
		
	}
}
