package p23_08_2022;

public class Ugovor {
//	Kreirati klasu Ugovor koja ima:
//		godinu, dan i mesec sklapanja ugovora
//		osobu koja prodaje nekretninu (fizicko lice)
//		osobu koja kupuje nekretninu (fizicko lice)
//		cenu za koju se prodaje nekretnina
//		adresu nekretnine (ulica br., grad)
//		metodu koja vraca procenat zarade
//		za osobu koja je vec kupovale nekretninu preko agencije je 0.02 dok je za one koji nisu 0.03
//		metodu koja racuna zaradu agencije pri prodaji nekretninte koja ukljucujei poreze, 
//		takse i usluge agencije, prema formuli:
//		1000 + cena za koju se prodaje * procenat zarade
//		metodu koja stampa ugovor u formatu:
//		Dana (dan.mesec.godina.)god sklopljen je ugovor izmedju (print prodavca) i (print kupca) o 
//		kupovini nekretnine (adresa) po ceni od (cena nekretnin) pri cemu je kupac u obavezi da agenciji 
//		isplati novcanu vrednost u iznosu od (zarada agencije)
	
	private int godina;
	private int mesec;
	private int dan;
	private FizickoLice prodavac;
	private FizickoLice kupac;
	private int cenaNekretnine;
	private String adresaNekretnine;
	
	
	
	public Ugovor(int godina, int mesec, int dan, FizickoLice prodavac, FizickoLice kupac, int cenaNekretnine,
			String adresaNekretnine) {
		this.godina = godina;
		this.mesec = mesec;
		this.dan = dan;
		this.prodavac = prodavac;
		this.kupac = kupac;
		this.cenaNekretnine = cenaNekretnine;
		this.adresaNekretnine = adresaNekretnine;
	}
	
	public int getCenaNekretnine() {
		return cenaNekretnine;
	}

	public void setCenaNekretnine(int cenaNekretnine) {
		this.cenaNekretnine = cenaNekretnine;
	}

	public String getAdresaNekretnine() {
		return adresaNekretnine;
	}

	public void setAdresaNekretnine(String adresaNekretnine) {
		this.adresaNekretnine = adresaNekretnine;
	}

	public double procenatZarade() {
		if (this.kupac.isPrvaKupovina() == true) {
			return 1000 + this.cenaNekretnine * 0.03;
		} else {
			return 1000 + this.cenaNekretnine * 0.02;
		}
	}
	public void stampajUgovor() {
		System.out.println("Dana " + this.dan + "." + this.mesec + "." + this.godina + 
				".god. sklopljen je ugovor izmedju " + this.prodavac.getImeIPrezime() + " i " +
				this.kupac.getImeIPrezime()  + " o kupovini nekretnine " + this.adresaNekretnine +
				" po ceni od " + this.cenaNekretnine + 
				" pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost u iznosu od " +
				this.procenatZarade());
	}


}
