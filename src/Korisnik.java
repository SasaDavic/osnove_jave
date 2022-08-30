
public class Korisnik {
//	Kreirati klasu Korisnik koja ima
//	ime
//	prezime
//	gettere i settere za ime i prezime
//	konstuktore koje mislite da su vam potrebni
//	metoda koja stampa u formatu:
//	(ime) (prezime)
	
	private String ime;
	private String prezime;
	
	public Korisnik(String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;
		
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
	
	
	
	
	
	
	
	
}
