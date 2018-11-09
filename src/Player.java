import java.util.ArrayList;

public class Player {
	ArrayList<Card> hands;
	String playerName;
	int money;
	int betting;
	public Player(Card card, String playerName, int money, int betMoney) {
		this.hands = new ArrayList<>();
		hands.add(card);
		this.playerName = playerName;
		this.money = money;
		this.betting = betMoney;
	}
	
	public int hit(Deck deck) {//ī�带 �޴´�
		Card card = deck.draw();
		hands.add(card);
		int sum = getScores();
		if(sum > 21) {
			return -1;
		}
		return sum;
	}
	
	private int getScores() {//������ �հ� ���
		int val = 0;
		for(int i = 0; i < hands.size(); i++) {
			val += hands.get(i).getNum();
		}
		return val;
	}
	
	public void split() {//�� �÷��̾ �и� �ΰ��� ������
		
	}
}
