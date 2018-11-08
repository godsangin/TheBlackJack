
public class GamePlay {// 객체로 변경예정
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

		for (int i = 0; i < players.length; i++) {
			players[i] = new Player(deck.draw(), playerNames[i]);
		}
		for (int i = 0; i < players.length; i++) {
			System.out.println(players[i].hit(deck));
		}
		
	}
}
