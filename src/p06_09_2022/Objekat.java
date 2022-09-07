package p06_09_2022;

public abstract class Objekat {
//		Kreirati abstraktnu klasu Objekat ciji su zasticeni atributi: Object
//	adresa (ulica i broj)
//	povrsina objekta
//	zona (1, 2 ili 3)
//	konstuktore, gettere i settere
//	metodu koja vraca koeficijent koji ce se koristiti za racunanje poreza u zavisnosti u kojoj zoni se nalazi objekat
//	zona 1, koeficijent je 1.4
//	zona 2, koeficijent je 1.1
//	zona 3, koeficijent je 1.05
//	abstraktnu metodu koja racuna i vraca porez objekta
//	abstraktnu metodu stampaj 
	
	protected String UlicaIBroj;
	protected int povrsina;
	protected int zona; //1, 2, 3
	
	
	
	public Objekat(String ulicaIBroj, int povrsina, int zona) {
		this.UlicaIBroj = ulicaIBroj;
		this.povrsina = povrsina;
		this.zona = zona;
	}
	public double koeficijentPoreza() {
		if (this.zona == 1) {
			return 1.4;
		} else if (this.zona == 2) {
			return 1.1;
		} else if (this.zona == 3) {
			return 1.05;
		}
		return 0;
	}
	public abstract double racunajPorez();
	public abstract void stampaj();
	
	public String getUlicaIBroj() {
		return UlicaIBroj;
	}
	public int getPovrsina() {
		return povrsina;
	}
	public int getZona() {
		return zona;
	}
	
	
	
}
