package p25_08_2022;

public class Reakcija {
//	Kreirati klasu Reakcija koja ima 
//	tip reakcije (smajli, like, srce)
//	ime i prezime korisnika koji je reagovao 
//	gettere, settere i konstruktore
	
	private String tipReakcije;
	private String imeKorisnika;
	
		
	public Reakcija(String tipReakcije, String imeKorisnika) {
		this.tipReakcije = tipReakcije;
		this.imeKorisnika = imeKorisnika;
	}
	public String getTipReakcije() {
		return tipReakcije;
	}
	public void setTipReakcije(String tipReakcije) {
		this.tipReakcije = tipReakcije;
	}
	public String getImeKorisnika() {
		return imeKorisnika;
	}
	public void setImeKorisnika(String imeKorisnika) {
		this.imeKorisnika = imeKorisnika;
	}
	
	
	
	
	
	
	
}
