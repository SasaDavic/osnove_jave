package p25_08_2022;

import java.util.ArrayList;

public class Pasta {
//	Kreirati klasu Pasta koja ima:
//niz sastojaka
//metodu za dodavanje sastojka
//defaultni konstruktor
//metodu koja racuna cenu paste, tako sto sumira cene svih sastojaka
//metodu za stampu koja stampa podatke u formatu:
//Pasta je sa sastojcima:
//naziv - cena.din
//naziv - cena.din
//naziv - cena.din
//Cena paste je cena.din
	
	private ArrayList<Sastojak> sastojci = new ArrayList<Sastojak>();
		
	public void dodaj(Sastojak sastojak) {
		this.sastojci.add(sastojak);
	}

	public Pasta() {		
	}

	
	public ArrayList<Sastojak> getSastojci() {
		return sastojci;
	}

	public void setSastojci(ArrayList<Sastojak> sastojci) {
		this.sastojci = sastojci;
	}
	
	//metodu koja racuna cenu paste, tako sto sumira cene svih sastojaka
	
	public int cenaPaste() {
		int suma = 0;
		for (int i = 0; i < this.sastojci.size(); i++) {
			suma = suma + this.sastojci.get(i).getCena();
		}
		return suma;
	}
	public void brisi(String naziv) {
		for (int i = 0; i < this.sastojci.size(); i++) {
			if (this.sastojci.get(i).getNaziv().equals(naziv)) {
				this.sastojci.remove(i);
				this.sastojci.remove(naziv);
			}
		}
		
	}
	
	
	//metodu za stampu koja stampa podatke u formatu:
	//Pasta je sa sastojcima:
	//naziv - cena.din
	//naziv - cena.din
	//naziv - cena.din
	//Cena paste je cena.din
	
	public void stampaj() {
		System.out.println("Pasta je sa sastojcima: ");
		for (int i = 0; i < this.sastojci.size(); i++) {
			this.sastojci.get(i).stampaj();			
		}
		System.out.println("Suma sastojaka je: " + this.cenaPaste() + "rsd.");
	}
	
	
	
	
	
}
