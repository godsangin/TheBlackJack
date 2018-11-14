import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class UIContainer extends JFrame{
	ArrayList<Card> cards;
	int money;
	
	public UIContainer(ArrayList<Card> cards, int money) {
		this.cards = cards;
		this.money = money;
		setSize(400,400);
        setVisible(true);

        setLayout(new BorderLayout());

        JLabel background=new JLabel(new ImageIcon("clova_1.PNG"));

        add(background);

	}
	
	
}
