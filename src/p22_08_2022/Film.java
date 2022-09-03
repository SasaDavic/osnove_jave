package p22_08_2022;

public class Film {
//	Kreirati klasu Film koja ima:
//	naziv filma
//	iz koje godine je film 
//	reziser
//	konstruktore, gettere i settere koji su potrebni
//	metodu print koja stampa podatke u formatu
//	naziv filma, godina
//	Rezirao je: Ime prezime, starost.god
	
	private String naziv;
	private int godina;
	private Reziser reziser;
	
	public Film(String naziv, int godina) {
		
		this.naziv = naziv;
		this.godina = godina;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getGodina() {
		return godina;
	}

	public void setGodina(int godina) {
		this.godina = godina;
	}

	public Reziser getReziser() {
		return reziser;
	}

	public void setReziser(Reziser reziser) {
		this.reziser = reziser;
	}
//	naziv filma, godina
//	Rezirao je: Ime prezime, starost.god
	public void print() {
		System.out.println(this.naziv + ", " + this.godina);
		System.out.print("Rezirao je: ");
		this.reziser.print();
	}

	
	
	
}
