
public class Kupac {
//	Kreirati klasu Kupac koja ima:
//	ime i prezime
//	clansku kartu
//	gettere i settere, clanska karta ne moze da se menja
//	konstruktore
//	metodu stampaj koja stampa u formatu
//	ime i prezime - broj kartice
	
	private String imeIPrezime;
	private ClanskaKarta clanskaKarta;
		
	public Kupac(String imeIPrezime, ClanskaKarta clanskaKarta) {
		this.imeIPrezime = imeIPrezime;
		this.clanskaKarta = clanskaKarta;
	}
	public String getimeIPrezime() {
		return imeIPrezime;
	}
	public void setimeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	
	public ClanskaKarta getClanskaKarta() {
		return clanskaKarta;
	}
	
	public void print() {
		System.out.println("Kupac: " + this.imeIPrezime + " - " + this.clanskaKarta.getBroj());
	}
	
	
	
}
