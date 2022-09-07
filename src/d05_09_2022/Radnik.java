package d05_09_2022;

import java.util.ArrayList;

public abstract class Radnik {
//	Kreirati abstraktnu klasu Radnik koja ima:
//	 ime i prezime
//	 niz sektora u kojima radi
//	 abstraktnu metodu koja vraca platu radnika
//	 metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom
	
	
	protected String imeRadnika;
	
	protected ArrayList<Sektor> niz = new ArrayList<Sektor>();
	
	public abstract double plata();
	
	
	public void zaposliSeUSektor(Sektor s) {
		niz.add(s);
		
	}

	public Radnik(String imeRadnika) {
		
		
		this.imeRadnika = imeRadnika;
	}



	public String getImeRadnika() {
		return imeRadnika;
	}

	public void setImeRadnika(String imeRadnika) {
		this.imeRadnika = imeRadnika;
	}


	

	
	
}
