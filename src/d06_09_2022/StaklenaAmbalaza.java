package d06_09_2022;

public class StaklenaAmbalaza extends Ambalaza{
//	Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//	kaucija za flasu
//	atribut koji kaze da li se za flasu placa kaucija
//	osnovna cena
//	gettere i setter za atribute
//	konstuktori koji su vam potrebni

	
	private double kaucijaFlasa;
	private boolean daLiPlacateKauciju;
	private double osnovnaCena;
	
	public StaklenaAmbalaza(double kaucijaFlasa, boolean daLiPlacateKauciju, double osnovnaCena) {
		super();
		this.kaucijaFlasa = kaucijaFlasa;
		this.daLiPlacateKauciju = daLiPlacateKauciju;
		this.osnovnaCena = osnovnaCena;
	}

	public void setKaucijaFlasa(double kaucijaFlasa) {
		this.kaucijaFlasa = kaucijaFlasa;
	}

	public void setDaLiPlacateKauciju(boolean daLiPlacateKauciju) {
		this.daLiPlacateKauciju = daLiPlacateKauciju;
	}

	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}

	public StaklenaAmbalaza() {
		// TODO Auto-generated constructor stub
	}

	public StaklenaAmbalaza(String barkod, String nazivArtikla, double netoTezina, double brutoTezina) {
		super(barkod, nazivArtikla, netoTezina, brutoTezina);
		
	}

	public double getKaucijaFlasa() {
		return kaucijaFlasa;
	}

	public boolean isDaLiPlacateKauciju() {
		return daLiPlacateKauciju;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}

//	racuna cenu
//	ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//	ako se ne placa, (osnovna cena) * 1.2
//	metoda stampaj stampa sve podatke iz klase staklena flasa.
	
	public double cena() {
		if (this.daLiPlacateKauciju == true) {
			return this.osnovnaCena * 1.2 * this.kaucijaFlasa;
		} else {
			return this.osnovnaCena * 1.2;
		}
	}
	
	public void stampaj() {
		System.out.println(this.barkod + ", " + this.nazivArtikla + ", " + this.brutoTezina 
				 + ", " + this.netoTezina);
		if (this.daLiPlacateKauciju == true) {
			System.out.println("Placate kauciju " + this.kaucijaFlasa + " i osnovna cena je " + this.osnovnaCena);
		} else {
			System.out.println("Ne placate kauciju " + this.kaucijaFlasa + " i osnovna cena je " + this.osnovnaCena);
		}
	}

	
	
	
	
	
}
