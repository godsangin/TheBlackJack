
public class Card {
	String shape;
	int num;
	public Card(String shape, int num) {
		this.shape = shape;
		this.num = num;
	}
	
	public int getNum() {
		if(num > 10) {
			return 10;
		}
		return num;
	}
	
	public int getRealNum() {
		return num;
	}
}
