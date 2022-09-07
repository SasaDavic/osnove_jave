package p05_09_2022;

public abstract class Student {
//	Kreirati apstraktnu klasu Student koja ima:
//	ime i prezime studenta
//	broj indeksa
//	godinu studija
//	gettere, settere i konstruktore

	
	protected String imeStudenta;
	protected int brIndexa;
	protected int godStudija;
	
	public Student(String imeStudenta, int brIndexa, int godStudija) {
		this.imeStudenta = imeStudenta;
		this.brIndexa = brIndexa;
		this.godStudija = godStudija;
	}

	public String getImeStudenta() {
		return imeStudenta;
	}

	public void setImeStudenta(String imeStudenta) {
		this.imeStudenta = imeStudenta;
	}

	public int getBrIndexa() {
		return brIndexa;
	}

	public void setBrIndexa(int brIndexa) {
		this.brIndexa = brIndexa;
	}

	public int getGodStudija() {
		return godStudija;
	}

	public void setGodStudija(int godStudija) {
		this.godStudija = godStudija;
	}
	
//	apstraktnu metodu koja vraca cenu skolarine.
//	apstraktnu metodu koja vraca da li je student na buzetu ili ne.
//	metodu koja stampa podatke u formatu:
//	ime i prezime, broj indeksa, godina studija
//	Finansiranje: budzet/samofinansirajuci
//	Cena skolarine: cena
	
	public abstract double skolarina();
	
	public abstract boolean budzet();
	
	public void stampaj() {
		System.out.println(this.imeStudenta + ", " + this.brIndexa + ", " + this.godStudija);
		System.out.println("Finansiranje: " + this.budzet());
		System.out.println("Cena skolarine: " + this.skolarina());
	}
}
