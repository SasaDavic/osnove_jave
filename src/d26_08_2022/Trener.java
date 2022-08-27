package d26_08_2022;

public class Trener extends Osoba {
//	Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//	godine iskustva
//	tip trenera (kondicioni, za igru, pomocni, personalni)
//	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
	
	private int godIskustva;
	private String tip;
	
	
	public Trener(String imeOsobe, String jmbg, int godRodjenja, int godIskustva, String tip) {
		super(imeOsobe, jmbg, godRodjenja);
		this.godIskustva = godIskustva;
		this.tip = tip;
	}


	public int getGodIskustva() {
		return godIskustva;
	}


	public void setGodIskustva(int godIskustva) {
		this.godIskustva = godIskustva;
	}


	public String getTip() {
		return tip;
	}


	public void setTip(String tip) {
		this.tip = tip;
	}
	public void stampaj() {
		super.stampaj();
		System.out.println("Godine iskustva: " + this.godIskustva + ", tip trenera: " + this.tip); 
		
	}
	
	
	
	
	
	
	
	
}
