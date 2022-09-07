package p05_09_2022;

public class Pravougaonik extends Figura{
//	 Kreirati klasu Pravougaonik koja nasledjuje klasu Figura:
//	 stranice a i b
//	 gettere/settere/konstruktore
//	 implementira metodu povrsina
//	 implementira metodu obim
	
	private int a;
	private int b;
	
	public Pravougaonik(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	public void povrsina() {
		double p = a * b;
		System.out.println(p);
	}
	
	public void obim() {
		double o = 2*a + 2*b;
		System.out.println(o);
	}
	
	public void stampaj() {
		System.out.print("Povrsina je ");
		this.povrsina();
		System.out.print("Obim je ");
		this.obim();
	}
	
}
