import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class GameContainer extends JFrame {
	public static final Dimension res = Toolkit.getDefaultToolkit().getScreenSize();// pc화면 해상도
	PlayerContainer[] pContainer;
	Deck deck;
	Player[] players;
	JPanel wholeContainer;
	MyListener myListener;

	public GameContainer(Deck deck, Player[] players) {
		this.deck = deck;
		this.players = players;
		this.pContainer = new PlayerContainer[players.length];
		myListener = new MyListener();
		setSize(res.width * 3 / 4, res.height * 3 / 4);
		wholeContainer = new JPanel();
		JPanel buttonContainer = new JPanel();
		setLayout(new BorderLayout());
		wholeContainer.setLayout(new BorderLayout());
		wholeContainer.setSize(res.width * 3 / 4, res.height * 3 / 4 - 50);
		
		for(int i = 0; i < players.length; i++) {
			pContainer[i] = new PlayerContainer(players[i].money);		
			
			
		}
		wholeContainer.add(pContainer[0], BorderLayout.NORTH);
		wholeContainer.add(pContainer[1], BorderLayout.EAST);
		wholeContainer.add(pContainer[2], BorderLayout.WEST);
		
		
		JButton startButton = new JButton("시 작");
		startButton.setSize(80, 50);
		startButton.setVisible(true);
		startButton.addActionListener(myListener);
		
		buttonContainer.add(startButton);
		buttonContainer.setVisible(true);
		wholeContainer.setVisible(true);
		add(buttonContainer, BorderLayout.SOUTH);
		add(wholeContainer, BorderLayout.NORTH);
		setVisible(true);
	}

	public void addCard(PlayerContainer pContainer, Card c) {
		pContainer.addCard(c);
		pContainer.setVisible(true);
		wholeContainer.setVisible(true);
		
	}
	
	public class MyListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			for(int i = 0; i < players.length; i++) {
				addCard(pContainer[i], deck.draw());
			}
		}
		
	}

}