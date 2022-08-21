package d18_08_2022;

public class FacebookPost {
	
	public String korisnikObjava;
	public String korisnikProfil;
	public String textObjave;
	public int brLajkova;
	public int brDeljenja;
	
	public void like() {
		this.brLajkova++;
	}
	public void share() {
		this.brDeljenja++;
	}
	public void dislike() {
		this.brLajkova--;
		if (this.brLajkova < 0) {
			this.brDeljenja = 0;
		}
	}
//	ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//				(tekst objave)
//				Likes (broj lajkova) | Shares (broj deljenja)
	public void print() {
		System.out.println(this.korisnikObjava + " >>> " + this.korisnikProfil);
		System.out.println(this.textObjave);
		System.out.println("Likes " + this.brLajkova + " | Shares " + this.brDeljenja);
	}
	

}
