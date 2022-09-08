package d06_09_2022;

public class Tetrapak extends Ambalaza{
//	Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//	atribut koji kaze da li se moze reciklirati
//	osnovna cena
//	gettere i setter za atribute
//	konstuktori koji su vam potrebni
	

	
	private boolean reciklaza;
	private double osnovnaCena;
	
	public Tetrapak(String barkod, String nazivArtikla, double netoTezina, double brutoTezina) {
		super(barkod, nazivArtikla, netoTezina, brutoTezina);
		}

	public Tetrapak(boolean reciklaza, double osnovnaCena) {
		this.reciklaza = reciklaza;
		this.osnovnaCena = osnovnaCena;
	}

	public boolean isReciklaza() {
		return reciklaza;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}
	
//	racuna cenu tako da ispunjava uslova:
//	ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//	ako nije u cenu ulazi samo osnovna cena
//	metoda stampaj stampa sve podatke iz klase tetrapak.
	
	public double cena() {
		if (this.reciklaza == true) {
			return this.tezinaPakovanja() * 1.5 * this.osnovnaCena;
		} else {
			return this.osnovnaCena;
		}
	}
	
	public void stampaj() { 
		System.out.println(this.barkod + ", " + this.nazivArtikla + ", " + this.brutoTezina 
				 + ", " + this.netoTezina);
		if (this.reciklaza == true) {
			System.out.println("Moze da se reciklira i osnovna cena je " + this.osnovnaCena);
		} else {
			System.out.println("Ne moze da se reciklira i osnovna cena je " + this.osnovnaCena);
		}
	}

	
	
	
}
