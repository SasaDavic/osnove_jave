package d26_08_2022;

public class Igrac extends Osoba {
//	Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//	broj (broj koji igrac nosi)
//	poziciju koju igra (odbrambeni, napadac, … )
//	kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//	default-ni konstuktor
//	konstuktor sa parametrima
//	gettere i settere za broj, kapiten i poziciju
//	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
	
	private int brojIgraca;
	private String pozicijja;
	private boolean kapiten;
	
	public Igrac() {
	}

	public Igrac(String imeOsobe, String jmbg, int godRodjenja, int brojIgraca, String pozicijja, boolean kapiten) {
		super(imeOsobe, jmbg, godRodjenja);
		this.brojIgraca = brojIgraca;
		this.pozicijja = pozicijja;
		this.kapiten = kapiten;
	}

	public int getBrojIgraca() {
		return brojIgraca;
	}

	public void setBrojIgraca(int brojIgraca) {
		this.brojIgraca = brojIgraca;
	}

	public String getPozicijja() {
		return pozicijja;
	}

	public void setPozicijja(String pozicijja) {
		this.pozicijja = pozicijja;
	}

	public boolean isKapiten() {
		return kapiten;
	}

	public void setKapiten(boolean kapiten) {
		this.kapiten = kapiten;
	}
	
	public void stampaj() {
		super.stampaj();
		System.out.println("Broj igraca: " + this.brojIgraca + ", pozicija: " + this.pozicijja +
				", kapiten: " + this.kapiten); 
		
	}
	
	
	
	
	
	
	
}
