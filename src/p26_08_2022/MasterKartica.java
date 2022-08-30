package p26_08_2022;

public class MasterKartica extends PlatnaKartica{


//	  Napraviti klasu MasterKartica koja nasledjuje klasu PlatnaKartica
//konstruktor sa parametrima
//implementira metodu koja vrsi transakciju, tako da na prosledjenu sumu dodaje proviziju od 1.5 posto na sumu.
//metoda naplatiOdrzavanje, koja sa racuna skida $2.
//implementira metodu koja stampa podatke o kartici u formatu:
//	  Master Card: 12/2019, 4012-1239-1221-3381, $232
	
	public MasterKartica(double suma, String brKartice, int godinaIsteka, int mesecIsteka) {
		super(suma, brKartice, godinaIsteka, mesecIsteka);
		
	}
	
	public void izvrsiTransakcijuProvizija(double sumaProvizija) {
		sumaProvizija = sumaProvizija * 1.015;
		}
	
	public void naplatiOdrzavanje() {
		super.suma = super.suma - 2;
	}
	public void stampaj() {
		System.out.print("Master Card:");
		super.stampaj();
	}
	
	
	
	}
	

