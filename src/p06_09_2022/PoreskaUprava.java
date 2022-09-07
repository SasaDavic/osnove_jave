package p06_09_2022;

import java.util.ArrayList;

public class PoreskaUprava {
//	Kreirati klasu PoreskaUprava koja za atribute ima:
//ime grada u kom se nalazi
//niz objekata
//metodu dodaj objekat
//(ze vezbanje)metodu koja vraca objekat sa najvecim porezom public Objekat najveciPorez
//(za vezbanje) metodu koja vraca objekat sa najmanjim porezom

	
	private String imeGrada;
	private ArrayList<Objekat> niz = new ArrayList<Objekat>();
	
	public PoreskaUprava(String imeGrada) {
		this.imeGrada = imeGrada;
		
	}
	
	public String getImeGrada() {
		return imeGrada;
	}

	public void setImeGrada(String imeGrada) {
		this.imeGrada = imeGrada;
	}

	public ArrayList<Objekat> getNiz() {
		return niz;
	}

	public void setNiz(ArrayList<Objekat> niz) {
		this.niz = niz;
	}

	public void dodajObjekat(Objekat objekat) {
		niz.add(objekat);
	}
	public Objekat najveciPorez() {
		double najveciPorez = 0;
		int brKlase = 0;
		for (int i = 0; i < niz.size(); i++) {
			if (niz.get(i).racunajPorez() > najveciPorez) {
				najveciPorez = niz.get(i).racunajPorez();
				brKlase = i;				
			}
		}
		return niz.get(brKlase);
	}
	public Objekat najmanjiPorez() {
		double najmanjiPorez = niz.get(0).racunajPorez();
		int brKlase = 0;
		for (int i = 0; i < niz.size(); i++) {
			if (niz.get(i).racunajPorez() <= najmanjiPorez) {
				najmanjiPorez = niz.get(i).racunajPorez();
				brKlase = i;				
			}
		}
		return niz.get(brKlase);
	}
	
	//metodu koja racuna ukupan porez za ceo grad
	//metodu koja stampa sve objekte
	
	public double porezZaCeoGrad() {
		double suma = 0;
		for (int i = 0; i < niz.size(); i++) {
			suma += niz.get(i).racunajPorez();
		}
		return suma;
	}
	public void stampaj() {
		for (int i = 0; i < niz.size(); i++) {
			niz.get(i).stampaj();
		}
	}
	
	
	
	
	
	
}
