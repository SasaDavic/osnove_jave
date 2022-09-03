package p22_08_2022;

public class Kupac {
//	 Kreirati klasu Kupac koja ima:
//	 ime i prezime
//	 clansku kartu
//	 gettere i settere, clanska karta ne moze da se menja
//	 konstruktore

	
	private String kupac;
	private ClanskaKarta clanskaKarta;
	
	public Kupac(String kupac, ClanskaKarta clanskaKarta) {
		this.kupac = kupac;
		this.clanskaKarta = clanskaKarta;
	}

	public String getKupac() {
		return kupac;
	}

	public void setKupac(String kupac) {
		this.kupac = kupac;
	}

	public ClanskaKarta getClanskaKarta() {
		return clanskaKarta;
	}
	
	
	public void setClanskaKarta(ClanskaKarta clanskaKarta) {
		this.clanskaKarta = clanskaKarta;
	}

	//	 metodu stampaj koja stampa u formatu
//	 ime i prezime - broj kartice
	public void stampaj() {
		System.out.println(this.kupac + " - " + this.clanskaKarta.getBroj());
	}
	
	
}
