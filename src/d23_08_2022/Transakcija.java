package d23_08_2022;

public class Transakcija {
//	Kreirati klasu Transakcija koja ima:
//	id transakcije
//	racun sa kog se prenose sredstva
//	racun na koji se prenose sredstva
//	gettere i settere
//	konstruktore

//	(Za vezbanje) Vodite racuna da na racunu sa kog se salju sredstva ima dovoljno sredstava
//	metodu koja stampa podatke o transakciji u formatu:
//	id transkacije
//	Racun sa: Ime i prezime  -  broj racuna
//	Racun na: Ime i prezime  -  broj racuna
	
	private int id;
	private Racun saljeNovac;
	private Racun primaNovac;
	private int promena;
	
//	privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
//	ako je prenos sredstava manji od 4500, provizija je fiksna 45
//	ako je prenos sredstava veci od 4500, provizija je 1% 
	
	
	
	private double provizija() {
		if (this.promena < 4500) {
			return 45;			
		} else {
			return this.promena * 0.01;
		}
	}
	
public Transakcija(int id, Racun saljeNovac, Racun primaNovac, int promena) {
	
	this.id = id;
	this.saljeNovac = saljeNovac;
	this.primaNovac = primaNovac;
	this.promena = promena;
}

//	metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi. Kao parametar funkcije se unosi 
//	vrednost koja se prebacuje. 
//	Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija), a na drugi racun dodaje samo 
//	(trazena suma).
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Racun getSaljeNovac() {
		return saljeNovac;
	}

	public void setSaljeNovac(Racun saljeNovac) {
		this.saljeNovac = saljeNovac;
	}

	public Racun getPrimaNovac() {
		return primaNovac;
	}

	public void setPrimaNovac(Racun primaNovac) {
		this.primaNovac = primaNovac;
	}

	public int getPromena() {
		return promena;
	}

	public void setPromena(int promena) {
		this.promena = promena;
	}

	public int transakcijaPrima() {
		return this.primaNovac.promenaStanja(this.promena); 
	}
	public int transakcijaSalje() {
		return this.saljeNovac.promenaStanja(-1*this.promena);
	}
//	id transkacije
//	Racun sa: Ime i prezime  -  broj racuna
//	Racun na: Ime i prezime  -  broj racuna
	public void print() {
		System.out.println("id transkacije: " + this.id);
		System.out.println("Racun sa: " + this.saljeNovac.getImeOsobe() + " - " + this.saljeNovac.getStanje());
		System.out.println("Racun na: " + this.primaNovac.getImeOsobe() + " - " + this.primaNovac.getStanje());
	}
	
}
