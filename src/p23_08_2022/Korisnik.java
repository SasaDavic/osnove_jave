package p23_08_2022;

public class Korisnik {
//	Kreirati klasu Korisnik koja ima:
//		ime i prezime 
//		tip licence (basic/pro/premium)
//		konstruktore. Po difoltu korisnik ima basic licencu.
//		gettere i settere za sve atribute, sem za tip licence koja ne moze da se menja
	
	private String imeIPrezime;
	private String tipLicence;
	
	public Korisnik() {
		this.tipLicence = "basic";
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}
//	metodu pretplati se koja postavlja licencu u zavisnosi od uplacene sume:
//	ako je uplata 100, postavlja licencu na “pro”
//	ako je uplata 150, postavlja licencu na “premium”
//	Metoda kao parametar prima vrednost uplate $100 ili $150
//	metodu ponisti pretplatu koja postavlja licencu na basic.
	
	public void pretplatiSe(int uplata) {
		if (uplata == 100) {
			this.tipLicence = "pro";
		} else if (uplata == 150) {
			this.tipLicence = "premium";
		} else this.tipLicence = "basic";
	}
	public void ponistiPretplatu() {
		this.tipLicence = "basic";
	}
	
//	metodu koja vraca maksimalnu duzinu trajanja video poziva u zavisnosti od licence
//	ako je basic, vraca 40min
//	ako je pro, vraca 240min
//	ako je  premium, vraca 1440min
//	metodu za stampu koja stampa u formatu:
//	ime i prezime
	
	public int maksimalnDuzinuTrajanjaVPoziva() {
		if (this.tipLicence.equals("basic")) {
			return 40;
		} else if (this.tipLicence.equals("pro")) {
			return 240;
		} else if (this.tipLicence.equals("premium")) {
			return 1440;
		} else {
			return 0;
		}
	}
	
	
	public void stampaj() {
		System.out.println(this.imeIPrezime + ", " + this.tipLicence);
	}
	
	
	
}
