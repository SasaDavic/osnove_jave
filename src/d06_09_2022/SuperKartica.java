package d06_09_2022;

public class SuperKartica {
//	Kreirati klasu SuperKartica koja ima:
//	broj kartice
//	ime i prezime vlasnika
//	popust (200, 500, … )
//	konstuktore (default-ni i sa parametrima)
//	gettere i settere 
//	metodu stampaj koja stampa karticu u formatu:
//	(broj kartice), (ime i prezime)
	
	
	private String brojKartice;
	private String imeVlasnika;
	private int popust;
	public SuperKartica(String brojKartice, String imeVlasnika, int popust) {
		super();
		this.brojKartice = brojKartice;
		this.imeVlasnika = imeVlasnika;
		this.popust = popust;
	}
	public SuperKartica() {
		super();
	}
	public String getBrojKartice() {
		return brojKartice;
	}
	public String getImeVlasnika() {
		return imeVlasnika;
	}
	public int getPopust() {
		return popust;
	}
	
	public void stampaj() {
		System.out.println(this.brojKartice + ", " + this.imeVlasnika);
	}
	
	
	
}
