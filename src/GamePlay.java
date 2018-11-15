import java.util.ArrayList;

public class GamePlay {// ��ü�� ���濹��
	Player[] players;
	Deck deck;

	public GamePlay(Player[] players, Deck deck) {
		this.players = players;
		this.deck = deck;
	}

	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.suffle();
		Player[] players = new Player[3];
		String[] playerNames = { "John", "Brian", "Marry" };
		Dealer dealer;

		for (int i = 0; i < players.length; i++) {//����ڰ� ���ñݾ��� Ŀ���� �� �� �ֵ��� ����
			players[i] = new Player(deck.draw(), playerNames[i], 100, 10);
		}
		dealer = Dealer.newInstance(deck.draw(), "Carry");
		for (int i = 0; i < players.length; i++) {
			System.out.println(players[i].hit(deck));
			dealer.hit(deck);
		}
		
		GameContainer ui = new GameContainer(deck, players);
	}
}
