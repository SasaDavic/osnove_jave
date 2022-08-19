package p19_08_2022;

public class Tacka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private int x;
	private int y;
	
	public Tacka() {
		
	}
	public Tacka(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return y;
	}
	public void print() {
		System.out.println("(" + x + ", " + y + ")");
	}
	
}
