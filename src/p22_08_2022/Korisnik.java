package p22_08_2022;

public class Korisnik {
//	Kreirati klasu Korisnik koja ima
//	ime
//	prezime
//	gettere i settere za ime i prezime
//	konstuktore koje mislite da su vam potrebni

	
	private String ime;
	private String prezime;
	
	public Korisnik() {
		
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
//	metoda koja stampa u formatu:
//	(ime) (prezime)
	
	public void stampaj() {
		System.out.println(this.ime + " " + this.prezime);
	}
	
	
}
