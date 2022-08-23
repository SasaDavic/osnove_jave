package p23_08_2022;

public class FizickoLice {
//	Za potrebe agencije za nekretnine kreirati  klasu FizickoLice koje ima:
//		ime i prezime
//		broj licne karte
//		jmbg
//		podatak da li je osoba vec jednom kupovala nekretninu preko agencije (boolean)
//		konstuktore
//		gettere i settere, jmbg ne sme da se menja
//		metodu stampaj, koja stmpa podatke u formatu:
//		ime i prezime, broj licne karte
	
	private String ImeIPrezime;
	private int brLK;
	private String jmbg;
	private boolean prvaKupovina;
	
	
	
	
	public FizickoLice(String imeIPrezime, int brLK, String jmbg, boolean prvaKupovina) {
		this.ImeIPrezime = imeIPrezime;
		this.brLK = brLK;
		this.jmbg = jmbg;
		this.prvaKupovina = prvaKupovina;
	}
	public String getImeIPrezime() {
		return ImeIPrezime;
	}
	public void setImeIPrezime(String imeIPrezime) {
		ImeIPrezime = imeIPrezime;
	}
	public int getBrLK() {
		return brLK;
	}
	public void setBrLK(int brLK) {
		this.brLK = brLK;
	}
	public boolean isPrvaKupovina() {
		return prvaKupovina;
	}
	public void setPrvaKupovina(boolean prvaKupovina) {
		this.prvaKupovina = prvaKupovina;
	}
	public String getJmbg() {
		return jmbg;
	}
	
	
	public void stampaj() {
		System.out.println(this.ImeIPrezime + ", broj licne karte: " + this.brLK);
	}


}
