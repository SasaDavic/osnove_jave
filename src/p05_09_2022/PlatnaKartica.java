package p05_09_2022;

public abstract class PlatnaKartica {
//	Napraviti klasu apstraktnu PlatnaKartica koja ima
//	  atribut suma  - cuva trenutnu sumu novca na kartici u dolarima
//	  atribut broj kartice  primer: 4012-1239-1221-3381
//	  atribut godina - godina do kada vazi kartica
//	  atribut mesec-  mesec do kada vazi kartica
//	  konstruktor sa parametrima
//	  gettere za sve atribute, bez settera
	
	protected double sumaDolari;
	protected String brKartice;
	protected int godinaIsteka;
	protected int mesecIsteka;
	
	public PlatnaKartica(double sumaDolari, String brKartice, int godinaIsteka, int mesecIsteka) {
		this.sumaDolari = sumaDolari;
		this.brKartice = brKartice;
		this.godinaIsteka = godinaIsteka;
		this.mesecIsteka = mesecIsteka;
	}

	public double getSumaDolari() {
		return sumaDolari;
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
	
//	  metodu dodajSredstva koja povecava sumu za unetu vrednost
//	  apstraktnu metodu izvrsiTransakciju koja skida prosledjenu vrednost sa racuna.
//	  apstraktnu metodu koja stampa podatke o kartici.

	public void dodajSredstva(double uplata) {
		this.sumaDolari += uplata;
	}
	public abstract void izvrsiTransakciju(double isplata);
	public abstract void stampaj();
	
	
	
	
}
