import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class GameContainer extends JFrame {
	public static final Dimension res = Toolkit.getDefaultToolkit().getScreenSize();// pc화면 해상도
	
	Deck deck;
	Player[] players;
//	MyListener myListener;

	public GameContainer(Deck deck, Player[] players) {
		this.deck = deck;
		this.players = players;
		setSize(res.width * 3 / 4, res.height * 3 / 4);
		JPanel buttonContainer = new JPanel();
		setLayout(new BorderLayout());
		PlayerContainer pContainer = new PlayerContainer(100);		
		
		JLabel container = new JLabel();
//		container.setLayout(new BorderLayout());
		container.setSize(200, 100);
//		container.add(pContainer, BorderLayout.EAST);
		container.add(pContainer);
		add(container);
		pContainer.setVisible(true);
		container.setVisible(true);
//		add(container, BorderLayout.EAST);// 이거에서 문제가 발생한다. !!
		
		
		JButton startButton = new JButton("시 작");
		startButton.setSize(80, 50);
		startButton.setVisible(true);
		startButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				pContainer.addCard(deck.draw());
				pContainer.updateUI();
			}
		});
		
		buttonContainer.add(startButton);
		buttonContainer.setVisible(true);
		add(buttonContainer, BorderLayout.SOUTH);
		setVisible(true);
	}

//	public void addCard(PlayerContainer pContainer, Card c) {
//		pContainer.addCard(c);
//		pContainer.setVisible(true);
//		wholeContainer.setVisible(true);
//		
//	}
	
//	public class MyListener implements ActionListener{
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//			pContainer.addCard(deck.draw());
//		}
//		
//	}

}