package p26_08_2022;

public class Osoba {
//	Kreirati klasu Osoba koja od atributa ima:
//	 ime i prezime
//	 jmbg
//	konstuktor sa parametrima
//	metodu stampaj koja stampa podatke u formatu
//				ime prezime, jmbg
	
	protected String imeIPrezime;
	protected String jmbg;
	
	public Osoba(String imeIPrezime, String jmbg) {
		super();
		this.imeIPrezime = imeIPrezime;
		this.jmbg = jmbg;
	}
	public void stampaj() {
		System.out.println(this.imeIPrezime + ", " + this.jmbg);
	}
	
	
	
	
	
}
