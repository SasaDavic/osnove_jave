package d19_08_2022;

public class FacebookPost {
//	Kreirati klasu FacebookPost koja ima:
//	   Od atributa:
//	ime i prezime korisnika koji je objavio post
//	ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite 
//			objavu na tudjem profilu)
//	tekst objave
//	broj lajkova
//	broj deljenja
//	 Konstruktore:
//	difoltni konstuktor
//	konstuktor koji postavlja ime i prezime korisnika ko je objavio, korisnika na kom je profilu 
//	objavnljen i tekst objave

	private String korisnikObjava;
	private String korisnikProfil;
	private String textObjave;
	private int brLajkova;
	private int brDeljenja;
	
	public FacebookPost() {
		this.brLajkova = 0;
		this.brDeljenja = 0;
	}

	public FacebookPost(String korisnikObjava, String korisnikProfil, String textObjave) {
		this.korisnikObjava = korisnikObjava;
		this.korisnikProfil = korisnikProfil;
		this.textObjave = textObjave;
	}
	
//	  Od metoda:
//	like(), koja povecava broj lajkova za 1.
//	dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//	share(), koja povecava broj deljenja za 1

	
	public void like() {
		this.brLajkova += 1;
	}
	
	public void dislike() {
		this.brLajkova -= 1;
		if (this.brLajkova < 0) {
			this.brLajkova = 0;
		}
	}
	
	public void share() {
		this.brDeljenja += 1;
	}
//	print(), koja stampa objavu u formatu:
//	(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//	(tekst objave)
//	Likes (broj lajkova) | Shares (broj deljenja)
	
	public void print() {
		System.out.println(this.korisnikObjava + " >>> " + this.korisnikProfil);
		System.out.println(this.textObjave);
		System.out.println("Likes " + this.brLajkova + " | Shares" + this.brDeljenja);
	}
	
	
}
