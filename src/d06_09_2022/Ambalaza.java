package d06_09_2022;

public abstract class Ambalaza {
//	Kreirati abstraktnu klasu Ambalaza koja ima:
//	barkod (primer: 328232-2823)
//	naziv artikla
//	neto tezinu
//	bruto tezinu
//	konstuktore (default-ni i sa parametrima)
//	gettere i settere

	protected String barkod;
	protected String nazivArtikla;
	protected double netoTezina;
	protected double brutoTezina;
	
	public Ambalaza() {
		
	}

	public Ambalaza(String barkod, String nazivArtikla, double netoTezina, double brutoTezina) {
		
		this.barkod = barkod;
		this.nazivArtikla = nazivArtikla;
		this.netoTezina = netoTezina;
		this.brutoTezina = brutoTezina;
	}

	public String getBarkod() {
		return barkod;
	}

	public String getNazivArtikla() {
		return nazivArtikla;
	}

	public double getNetoTezina() {
		return netoTezina;
	}

	public double getBrutoTezina() {
		return brutoTezina;
	}
	
//	metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
//	abstraktnu metodu koja vraca cenu artikla
//	abstraktnu metodu stampaj
	
	public double tezinaPakovanja() {
		return this.brutoTezina - this.netoTezina;
	}
	public abstract double cena();
	
	public abstract void stampaj();


}
