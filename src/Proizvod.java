
public class Proizvod {
//	Kreirati klasu Proizvod koja ima
//	Naziv proizvoda
//	kupca/musteriju
//	cenu izrade proizvoda
//	gettere i settere
//	konstruktore
//	Metodu za racunanje cene proizvoda, koja racuna cenu proizvoda po formuli:
//	cena izrade * 1.9 * (100 - popust na clansku karticu) / 100
//	Metodu za stampanje proizvoda u formatu:
//	naziv proizvoda - cena
//	ime i prezime - broj kartice
	
	private String naziv;
	private Kupac kupac;
	private int cenaIzrade;
	

	
	public Proizvod(String naziv, Kupac kupac) {
		this.naziv = naziv;
		this.kupac = kupac;
	}
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public double racunajCenu(int cenaIzrade) {
		return cenaIzrade * 1.9 * (100 - this.kupac.getClanskaKarta().getPopust()) / 100;
	}

	public void print() {
		System.out.println("Naziv proizvoda: " + " - " + this.cenaIzrade);
		System.out.println(this.kupac.getimeIPrezime() + " - " + this.kupac.getClanskaKarta().getBroj());
	}
	
	
	
}
