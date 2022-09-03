package p22_08_2022;

public class Proizvod {
//	 Zadatak (POGLEDAJ SLIKU)
//	 Kreirati klasu Proizvod koja ima
//	 Naziv proizvoda
//	 kupca/musteriju
//	 cenu izrade proizvoda
//	 gettere i settere
//	 konstruktore

	
	private String naziv;
	private Kupac kupac;
	private double cenaIzrade;
	
	public Proizvod(String naziv, Kupac kupac, int cenaIzrade) {
		
		this.naziv = naziv;
		this.kupac = kupac;
		this.cenaIzrade = cenaIzrade;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public double getCenaIzrade() {
		return cenaIzrade;
	}

	public void setCenaIzrade(int cenaIzrade) {
		this.cenaIzrade = cenaIzrade;
	}

	public Kupac getKupac() {
		return kupac;
	}
	
//	 Metodu za racunanje cene proizvoda, koja racuna cenu proizvoda po formuli:
//	 cena izrade * 1.9 * (100 - popust na clansku karticu) / 100
//	 Metodu za stampanje proizvoda u formatu:
//	 naziv proizvoda - cena
//	 ime i prezime - broj kartice
	
	public double cenaProizvoda () {
		return this.cenaIzrade * 1.9 * (100 - this.kupac.getClanskaKarta().getPopust()) / 100;
	}
	
	public void print() {
		System.out.println(this.naziv + " - " + this.cenaProizvoda());
		System.out.println(this.kupac.getKupac() + " - " + this.kupac.getClanskaKarta().getBroj());
	}
	
}
