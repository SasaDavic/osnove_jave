package p23_08_2022;

public class Ugovor {
//	Kreirati klasu Ugovor koja ima:
//	godinu, dan i mesec sklapanja ugovora
//	osobu koja prodaje nekretninu (fizicko lice)
//	osobu koja kupuje nekretninu (fizicko lice)
//	cenu za koju se prodaje nekretnina
//	adresu nekretnine (ulica br., grad)

	private String datumUgovora;
	private FizickoLice prodavac;
	private FizickoLice kupac;
	private int cenaNekretnine;
	private String adresa;
	
	
	
public Ugovor(String datumUgovora, FizickoLice prodavac, FizickoLice kupac, int cenaNekretnine, String adresa) {
		this.datumUgovora = datumUgovora;
		this.prodavac = prodavac;
		this.kupac = kupac;
		this.cenaNekretnine = cenaNekretnine;
		this.adresa = adresa;
	}



//	metodu koja vraca procenat zarade
//	za osobu koja je vec kupovale nekretninu preko agencije je 0.02 dok je za one koji nisu 0.03
//	metodu koja racuna zaradu agencije pri prodaji nekretninte koja ukljucujei poreze, takse i 
//	usluge agencije, prema formuli:
//	1000 + cena za koju se prodaje * procenat zarade
	
	public String getDatumUgovora() {
	return datumUgovora;
}



public void setDatumUgovora(String datumUgovora) {
	this.datumUgovora = datumUgovora;
}



public FizickoLice getProdavac() {
	return prodavac;
}



public void setProdavac(FizickoLice prodavac) {
	this.prodavac = prodavac;
}



public FizickoLice getKupac() {
	return kupac;
}



public void setKupac(FizickoLice kupac) {
	this.kupac = kupac;
}



public int getCenaNekretnine() {
	return cenaNekretnine;
}



public void setCenaNekretnine(int cenaNekretnine) {
	this.cenaNekretnine = cenaNekretnine;
}



public String getAdresa() {
	return adresa;
}



public void setAdresa(String adresa) {
	this.adresa = adresa;
}



	public double procenatZarade() {
		if(this.kupac.isPrvaKupovina() == true) {
			return 0.02;
		} else {
			return 0.03;
		}
	}
	
	public void zaradaAgencije() {
		double zarada = 1000 + this.cenaNekretnine * procenatZarade();
		System.out.println(zarada); ///ako je povratni tip onda ne mora stampa u okviru tela metoda
	}
	
	
//	metodu koja stampa ugovor u formatu:
//	Dana (dan.mesec.godina.)god sklopljen je ugovor izmedju (print prodavca) i (print kupca) o 
//	kupovini nekretnine (adresa) po ceni od (cena nekretnin) pri cemu je kupac u obavezi da agenciji 
//	isplati novcanu vrednost u iznosu od (zarada agencije)
	
	public void stampaj() {
		System.out.print("Dana " + this.datumUgovora + " god sklopljen je ugovor izmedju ");
		System.out.println(this.prodavac.getImeIPrezime() + " i " + this.kupac.getImeIPrezime() + " o kupovini nekretnine " + this.adresa);
		System.out.print(" po ceni od " + this.cenaNekretnine + " pri cemu je kupac u obavezi da agenciji ");
		System.out.print("isplati novcanu vrednost u iznosu od ");
		zaradaAgencije();
	}
	
}
