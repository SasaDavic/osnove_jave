package p19_08_2022;

public class Radnik {
//	Zad Kreirati klasu Radnik koja ima:
//	jmbg radnika
//	ime i prezime
//	broj dece (1,2,3,... ili 0 ako nema dece)
//	stepen strucne spreme (od 1 do 8)
//	godine radnog staza
	
	private String jmbg;
	private String imePrezime;
	private int brDece;
	private String sss;
	private int godRadnogStaza;
	
	public Radnik(String jmbg) {
		this.jmbg = jmbg;
	}

	public Radnik(String jmbg, String imePrezime, int brDece, String sss, int godRadnogStaza) {
		this.jmbg = jmbg;
		this.imePrezime = imePrezime;
		this.brDece = brDece;
		this.sss = sss;
		this.godRadnogStaza = godRadnogStaza;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public String getImePrezime() {
		return imePrezime;
	}

	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}

	public int getBrDece() {
		return brDece;
	}

	public void setBrDece(int brDece) {
		this.brDece = brDece;
	}

	public String getSss() {
		return sss;
	}

	public void setSss(String sss) {
		this.sss = sss;
	}

	public int getGodRadnogStaza() {
		return godRadnogStaza;
	}

	public void setGodRadnogStaza(int godRadnogStaza) {
		this.godRadnogStaza = godRadnogStaza;
	}	
	
	
	
//	konstuktor koji postavlja samo jmbg
//	konstuktor koji postavlja sve atribute
//	getere i setere
	
	public double minuliRad() {
		if (this.godRadnogStaza < 10) {
			return this.godRadnogStaza * 0.05;
		} else if (this.godRadnogStaza <= 20) {
			return this.godRadnogStaza * 0.075;
		} else {
			return this.godRadnogStaza * 0.1;
		}
	}
//	metodu koja racuna i vraca minuli rad(Ima ispod kako se racuna)
//	Minuli rad - zarada zaposlenog uvećava se za svaku započetu godinu radnog staža:
//	- do 10 godina 0.05
//	- od 10-20 godina 0.075
//	- preko 20 godina 0.1
	
	public double koeficijentSlozenosti() {
		if (this.sss.equals("I")) {
			return 1.03;
		} else if (this.sss.equals("II")) {
			return 1.65;
		} else if (this.sss.equals("III")) {
			return 2.00;
		} else if (this.sss.equals("IV")) {
			return 2.27;
		} else if (this.sss.equals("V")) {
			return 2.88;
		} else if (this.sss.equals("VI")) {
			return 3.09;
		} else if (this.sss.equals("VII")) {
			return 3.40;
		} else if (this.sss.equals("VIII")) {
			return 4.12;
		}
		return 0;
	}
	
//	metodu koja vraca koeficijent slozenosti (Ima ispod kako se racuna)
//	Koeficijent slozenosti
//	- (I stepen) Nekvalifikan radnik, koeficijent: 1,03;
//	- (II stepen) Osnovno obrazovanje, koeficijent: 1,65;
//	- (III stepen) Srednje obrazovanje u trajanju od dvije do tri god., koeficijent: 2,00;
//	- (IV stepen) Kvalifikacija srednjeg opšteg i stručnog obrazovanja, koeficijent: 2,27;
//	- (V stepen) Kvalifikacija višeg stručnog obrazovanja, koeficijent: 2,88;
//	- (VI stepen) Visoko obrazovanje, koeficijent: 3,09;
//	- (VII stepen) Fakultetsko, odnosno visoko obrazovanje - Bechelor, koeficijent: 3,40;
//	- (VIII stepen) Doktorat nauka, koeficijent: 4,12.
	
	
	public double racunajPlatu() {
		double plata = 25000 + (this.koeficijentSlozenosti() + this.minuliRad()) * 10000;
		
		return plata;
	}
	
//	metodu koja racuna platu radnika, plata se racuna po formuli:
//	25000 + (koeficijent slozenosti + minuli rad) * 10000
	
	public boolean kreditnoSposoban() {
		if (this.racunajPlatu() > 50000) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
//	metodu koja vraca da li je zaposleni kreditno sposoban. (Kreditno je sposoban ako je plata veca od 50 000)
//

//

	
	
	
	
	
	
	
	
	
}
