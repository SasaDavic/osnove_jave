package d23_08_2022;

public class Transakcija {
//	Kreirati klasu Transakcija koja ima:
//	id transakcije
//	racun sa kog se prenose sredstva
//	racun na koji se prenose sredstva
//	gettere i settere
//	konstruktore
	
	private String idTransakcije;
	private Racun saKogSePrenoseS;
	private Racun naKojiSePrenoseS;
	
	public Transakcija(String idTransakcije, Racun saKogSePrenoseS, Racun naKojiSePrenoseS) {
		
		this.idTransakcije = idTransakcije;
		this.saKogSePrenoseS = saKogSePrenoseS;
		this.naKojiSePrenoseS = naKojiSePrenoseS;
	}	
	
//	privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
//	ako je prenos sredstava manji od 4500, provizija je fiksna 45
//	ako je prenos sredstava veci od 4500, provizija je 1% 
	
	private double provizija(double novac) {
		if (novac <= 4500) {
			return 45;
		} else {
			return 0.01 * novac;
		}
	}
	
//	S obzirom da se provizija racuna na osnovu visine transakcije, znaci da metoda prima parametar 
//	koji predstavlja visinu transakcije
//	Ukoliko ne znate da resite ovu metodu, u metodi izvrsi transakciju racunajte fiksnu proviziju u 
//	vrednosti od 45.
	
	public void izvrsiTransakciju(double novac) {
		if (this.saKogSePrenoseS.getStanje() < novac) {
			System.out.println("Nema dovoljno novca na racunu!");
		} else {
			double n = this.provizija(novac);
			this.saKogSePrenoseS.promenaStanja(-(novac + n));
			this.naKojiSePrenoseS.promenaStanja(novac);
		}
	}
	
//	metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi. Kao parametar 
//	funkcije se unosi vrednost koja se prebacuje. 
//	Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija), a na drugi 
//	racun dodaje samo (trazena suma).
//	(Za vezbanje) Vodite racuna da na racunu sa kog se salju sredstva ima dovoljno sredstava
//	metodu koja stampa podatke o transakciji u formatu:
//	id transkacije
//	Racun sa: Ime i prezime  -  broj racuna
//	Racun na: Ime i prezime  -  broj racuna
	
	public void stamapaj() {
		System.out.print("id transkacije:");
		System.out.println(this.idTransakcije);
		System.out.print("Racun sa: ");
		this.saKogSePrenoseS.print();
		System.out.print("Racun na: ");
		this.naKojiSePrenoseS.print();
	}
	
	
}
