package d23_08_2022;

public class Racun {
//	Kreirati klasu Racun koja ima:
//	broj racuna (npr: 170-289328923-23)
//	ime i prezime osobe
//	trenutno stanje na racunu (npr: 100, 1220)
//	gettere i setter za sve atribute, sem settera za stanje na racunu
	
	private String broj;
	private String vlasnik;
	private double stanje;
	
	public Racun(String broj, String vlasnik, double stanje) {
		
		this.broj = broj;
		this.vlasnik = vlasnik;
		this.stanje = stanje;
	}
	public String getBroj() { 
		return broj;
	}
	public void setBroj(String broj) {
		this.broj = broj;
	}
	public String getVlasnik() {
		return vlasnik;
	}
	public void setVlasnik(String vlasnik) {
		this.vlasnik = vlasnik;
	}
	public double getStanje() {
		return stanje;
	}
//	metodu koja menja stanje na racunu za prosledjenu vrednost 
//	(stanje na racunu ne moze da bude manje od nule)
//	metodu koja stampa podatke o racunu u formatu:
//	Ime i prezime  -  broj racuna
//	stanje na racunu je (trenutno stanje) rsd.
	
	public void promenaStanja(double promenaNaRacunu) { //mora da se naglasni - ili + tj da li se skida novac ili uplacuje
		if (this.stanje + promenaNaRacunu <= 0) {
			this.stanje = 0;
		} else {
			this.stanje += promenaNaRacunu;
		}
	}
	public void print() {
		System.out.println(this.vlasnik + " - " + this.broj);
		System.out.println("Stanje na racunu je " + this.stanje + " rsd.");
	}
	
	
}
