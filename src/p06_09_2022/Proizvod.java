package p06_09_2022;

import java.util.ArrayList;

public abstract class Proizvod {
//	Kreirati abstraktnu klasu Proizvod koja ima:
//	 niz dodataka
//	 metodu ubaciDodatak koja dodaje dodatak u niz

	
	protected ArrayList<Dodatak> niz = new ArrayList<Dodatak>();
	
	public void ubaciDodatak(Dodatak dodatak) {
		niz.add(dodatak);
	}
	
//	 metodu koja vraca cenu svih dodataka koje ima proizvod
//	 abstraktnu metodu ukupnu racunaj cenu 
//	 abstraktnu metodu stampaj//
	
	public double cenaDodataka() {
		double suma = 0;
		for (int i = 0; i < niz.size(); i++) {
			suma += niz.get(i).getCena();
		}
		return suma;
	}
	
	public abstract double ukupnuRacunajCenu();
	public abstract void stampaj();
	
	
}
