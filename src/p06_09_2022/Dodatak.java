package p06_09_2022;

public class Dodatak {
//	Kreirati klasu Dodatak ili Sastojak kako hocete koja ima:
//	 naziv dodatka
//	 cenu dodatka
//	 konstruktore, gettere i settere koji su vam potrebni
//	 metodu stampaj koja stampa u formatu:
//	(dodatak)  (cena)
	
	private String naziv;
	private double cena;
	
	public Dodatak(String naziv, double cena) {
		this.naziv = naziv;
		this.cena = cena;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}
	
	public void stampaj() {
		System.out.println(this.naziv + " " + this.cena);
	}
	
}
