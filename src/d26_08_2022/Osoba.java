package d26_08_2022;

public class Osoba {
//	Kreirati klasu Osoba koja ima:
//	ime i prezime
//	jmbg
//	godinu rodjenja
//	default-ni konstuktor
//	konstuktor sa parametrima
//	gettere i settere 
//	metodu stampaj koja stampa u formatu:
//	(ime i prezime), (jmbg), (godina rodjenja)
	
	protected String imeOsobe;
	protected String jmbg;
	protected int godRodjenja;
	public Osoba() {
	}
	public Osoba(String imeOsobe, String jmbg, int godRodjenja) {
		this.imeOsobe = imeOsobe;
		this.jmbg = jmbg;
		this.godRodjenja = godRodjenja;
	}
	public String getImeOsobe() {
		return imeOsobe;
	}
	public void setImeOsobe(String imeOsobe) {
		this.imeOsobe = imeOsobe;
	}
	public String getJmbg() {
		return jmbg;
	}
	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}
	public int getGodRodjenja() {
		return godRodjenja;
	}
	public void setGodRodjenja(int godRodjenja) {
		this.godRodjenja = godRodjenja;
	}
	
	public void stampaj() {
		System.out.println(this.imeOsobe + ", " + this.jmbg + ", " + this.godRodjenja);
	}
	
	
}
