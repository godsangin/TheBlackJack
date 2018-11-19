import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class PlayerContainer extends JLabel{
	ArrayList<Card> cards;
	int money;
	public static final Dimension res = Toolkit.getDefaultToolkit().getScreenSize();//pc화면 해상도
	
	public PlayerContainer(int money) {
		this.money = money;
		cards = new ArrayList<>();
		setSize((int) (res.getWidth() / 3), 150);
		Card c = new Card("Clova", 10);
		JLabel background = new JLabel(new ImageIcon(c.shape + "_" + c.num + ".PNG"));
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(background);
        setVisible(true);
	}
	
	public void addCard(Card c) {
		cards.add(c);
		JLabel background = new JLabel(new ImageIcon(c.shape + "_" + c.num + ".PNG"));

        add(background);
        setVisible(true);
	}
	
	
	
}
