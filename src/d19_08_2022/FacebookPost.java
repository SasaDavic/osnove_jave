package d19_08_2022;

public class FacebookPost {
	private String korisnikObjavio;
	private String korisnikProfil;
	private String text;
	private int likes;
	private int share;
	
	public FacebookPost() { //difoltni konstruktor
		
	}
	public void setKorisnikObjavio(String korisnikObjavio) {
		this.korisnikObjavio = korisnikObjavio;
	}
	public void setKorisnikProfil(String korisnikProfil) {
		this.korisnikProfil = korisnikProfil;
	}
	public void setText(String text) {
		this.text = text;
	}
	public void setLikes1(int likes) {
		this.likes = likes;
	}
	public void setShares1(int share) {
		this.share = share;
	}
	
	public String grtKorisnikObjavio(String korisnikObjavio) {
		return this.korisnikObjavio;
	}
	public String getKorisnikProfil(String korisnikProfil) {
		return this.korisnikProfil;
	}
	public String getText(String text) {
		return this.text;
	}
	public int setLikes(int likes) {
		return this.likes = likes;
	}
	public int setShares(int share) {
		return this.share = share;
	}
	
	
	public FacebookPost(String korisnikObjavio, String korisnikProfil, String text, int likes, int share) {
		this.korisnikObjavio = korisnikObjavio;
		this.korisnikProfil = korisnikProfil;
		this.text = text;
		this.likes = likes;
		this.share = share;
	}
	public void addLike() {
		this.likes++;
	}
	public void dislike() {
		this.likes--;
	}
	public void addShare() {
		this.share++;
	}
	
//	(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
////	(tekst objave)
////	Likes (broj lajkova) | Shares (broj deljenja)
	public void print() {
		System.out.println(this.korisnikObjavio + " >>> " + this.korisnikObjavio);
		System.out.println(this.text);
		System.out.println("Likes " + this.likes + " | Shares " + this.share);
	}
	
	
}
