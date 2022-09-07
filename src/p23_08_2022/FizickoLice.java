package p23_08_2022;

public class FizickoLice {
//	Za potrebe agencije za nekretnine kreirati  klasu FizickoLice koje ima:
//	ime i prezime
//	broj licne karte
//	jmbg
//	podatak da li je osoba vec jednom kupovala nekretninu preko agencije (boolean)
//	konstuktore
//	gettere i settere, jmbg ne sme da se menja

	
	private String imeIPrezime;
	private int brLicneKarte;
	private String jmbg;
	private boolean prvaKupovina;
	
	public FizickoLice(String imeIPrezime, int brLicneKarte, String jmbg, boolean prvaKupovina) {
		this.imeIPrezime = imeIPrezime;
		this.brLicneKarte = brLicneKarte;
		this.jmbg = jmbg;
		this.prvaKupovina = prvaKupovina;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public int getBrLicneKarte() {
		return brLicneKarte;
	}

	public void setBrLicneKarte(int brLicneKarte) {
		this.brLicneKarte = brLicneKarte;
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
//	metodu stampaj, koja stmpa podatke u formatu:
//	ime i prezime, broj licne karte
	
	public void stampaj() {
		System.out.println(this.imeIPrezime + ", " + this.brLicneKarte);
	}
	
	
	
	
	
	
}
