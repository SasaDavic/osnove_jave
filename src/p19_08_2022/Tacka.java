package p19_08_2022;

public class Tacka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private int x;
	private int y;
	
	public Tacka() { //difoltni konstruktor- vrednosti su 0,0
		
	}
	public Tacka(int x, int y) { //kostruktor koji prima dve vrednosti
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x) { //seter
		this.x = x;
	}
	public void setY(int y) { //seter
		this.y = y;
	}
	public int getX() { //geter - vraca x, nema vrednost
		return this.x;
	}
	public int getY() { //geter - vraca y
		return y;
	}
	public void print() {
		System.out.println("(" + x + ", " + y + ")");
	}
	
}
