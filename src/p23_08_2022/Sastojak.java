package p23_08_2022;

public class Sastojak {
//	Kreirati klasu Sastojak koja ima:
//	naziv sastojka
//	cenu 
//	gettere i settere 
//	konstuktore
	
	private String naziv;
	private double cena;
	public Sastojak(String naziv, double cena) {
		
		this.naziv = naziv;
		this.cena = cena;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}
	
	
	
	
}
