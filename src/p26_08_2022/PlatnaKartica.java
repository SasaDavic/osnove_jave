package p26_08_2022;

public class PlatnaKartica {

//	 Napraviti klasu PlatnaKartica koja ima
//	  atribut suma  - cuva trenutnu sumu novca na kartici u dolarima
//	  atribut broj kartice  primer: 4012-1239-1221-3381
//	  atribut godina - godina do kada vazi kartica
//	  atribut mesec-  mesec do kada vazi kartica
//	  konstruktor sa parametrima
//	  gettere za sve atribute, bez settera

	
	protected double suma;
	protected String brKartice;
	protected int godinaIsteka;
	protected int mesecIsteka;
	
	public PlatnaKartica(double suma, String brKartice, int godinaIsteka, int mesecIsteka) {
		
		this.suma = suma;
		this.brKartice = brKartice;
		this.godinaIsteka = godinaIsteka;
		this.mesecIsteka = mesecIsteka;
	}

	public double getSuma() {
		return suma;
	}

	public String getBrKartice() {
		return brKartice;
	}

	public int getGodinaIsteka() {
		return godinaIsteka;
	}

	public int getMesecIsteka() {
		return mesecIsteka;
	}
	
//	   metodu dodajSredstva koja povecava sumu za unetu vrednost
//	  metodu izvrsiTransakciju koja skida prosledjenu vrednost sa racuna.
//	  metodu koja stampa podatke o kartici u formatu:
//		  4012-1239-1221-3381, 11/2019, $212
	
	public void dodajSredstva(int uplata) {
		this.suma = this.suma + uplata;
	}
	public void izvrsiTransakciju(int isplata) { /// skida prosledjenu vrednost
		this.suma = this.suma - isplata;
	}
	public void stampaj() {
		System.out.println(this.brKartice + ", " + this.mesecIsteka + "/" + this.godinaIsteka + ", $" + this.suma);
	}
	
	
}
