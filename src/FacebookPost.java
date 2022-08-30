
public class FacebookPost {
//	Kreirati klasu FacebookPost
//	opis
//	korisnik (referenca na korisnika koji je kreirao post)
//	konstrukore koje mislite da su vam potrebni
//	metoda print, stampa u formatu:
//	(ime) (prezime)
//	(opis post-a)
	
	private String opis;
	private Korisnik korisnik;
	
	public FacebookPost(String opis, Korisnik korisnik) {
		this.opis = opis;
		this.korisnik = korisnik;
		
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	
	public void print() {
		System.out.println("Opis: " + this.opis);
		System.out.println("Korisnik: " + this.korisnik.getIme() + ", " + this.korisnik.getPrezime());
	}
	
	
	
	
	
	
}
