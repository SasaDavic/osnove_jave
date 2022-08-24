package d23_08_2022;

public class Racun {
//	// Kreirati klasu Racun koja ima:
//	broj racuna (npr: 170-289328923-23)
//	ime i prezime osobe
//	trenutno stanje na racunu (npr: 100, 1220)
//	gettere i setter za sve atribute, sem settera za stanje na racunu

	
	private String broj;
	private String ImeOsobe;
	private int stanje;
	
	
	///konstruktor
	
	public String getBroj() {
		return broj;
	}
	public Racun(String broj, String imeOsobe, int stanje) {
		
		this.broj = broj;
		ImeOsobe = imeOsobe;
		this.stanje = stanje;
	}
	public void setBroj(String broj) {
		this.broj = broj;
	}
	public String getImeOsobe() {
		return ImeOsobe;
	}
	public void setImeOsobe(String imeOsobe) {
		ImeOsobe = imeOsobe;
	}
	public int getStanje() {
		return stanje;
	}
	
//	metodu koja menja stanje na racunu za prosledjenu vrednost (stanje na racunu ne moze da bude manje od nule)
//	metodu koja stampa podatke o racunu u formatu:
//	Ime i prezime  -  broj racuna
//	stanje na racunu je (trenutno stanje) rsd.
	
	public int promenaStanja(int promena) {
		this.stanje = this.stanje + promena;
		if (this.stanje <= 0) {
			this.stanje = this.stanje - promena;
			System.out.println("Nemate dovoljno novca na racunu");
		}
		return stanje;
	}
	public void print() {
		System.out.println(this.ImeOsobe + " - " + this.broj);
		System.out.println("Stanje na racunu je " + this.stanje + " rsd.");
	}
	
	
	
	
}
	
	
	

