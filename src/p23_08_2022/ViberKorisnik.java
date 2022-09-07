package p23_08_2022;

public class ViberKorisnik {
//	Kreirati klasu ViberKorisnik koja ima:
//	ime i prezime
//	broj telefona
//	da li je trenutno aktivan (boolean)
//	gettere, settere, konstuktore
	
	private String ime;
	private String brojTel;
	private boolean aktivan;
	public ViberKorisnik(String ime, String brojTel, boolean aktivan) {
		
		this.ime = ime;
		this.brojTel = brojTel;
		this.aktivan = aktivan;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getBrojTel() {
		return brojTel;
	}
	public void setBrojTel(String brojTel) {
		this.brojTel = brojTel;
	}
	public boolean isAktivan() {
		return aktivan;
	}
	public void setAktivan(boolean aktivan) {
		this.aktivan = aktivan;
	}
	
	
	
}
