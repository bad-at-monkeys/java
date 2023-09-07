package topicsAssessed;

public class Rectangle {
	private	int l;
	private int w;
	
	public Rectangle() {
		
	}
	public Rectangle(int l, int w) {
		this.l=l;
		this.w=w;
	}
	
	public int getL() {
		return l;
	}
	public int getW() {
		return w;
	}
	
	public void setL(int l) {
		this.l=l;
	}
	public void setW(int w) {
		this.w=w;
	}
	
	public int calcArea() {
		return l*w;
	}

	public static void main(String[] args) {
		Rectangle room = new Rectangle(2,8);
		System.out.println(room.calcArea());

	}

}
