package p26_08_2022;

public class Profesor extends Osoba {

//	Kreirati klasu Profesor koja nasledjuje klasu Osoba, 
//	koja od dodatnih atributa ima:
//naziv predmeta koji predaje
//iznos plate
//konstuktor sa parametrima

	public String nazivPredmeta;
	public double iznosPlate;
	
	public Profesor(String imeIPrezime, String jmbg, String nazivPredmeta, double iznosPlate) {
		super(imeIPrezime, jmbg);
		this.nazivPredmeta = nazivPredmeta;
		this.iznosPlate = iznosPlate;
	}
	
	
	//metodu povecaj platu. Metoda kao parametar prima procenat povecanja.
	//Napisati metodu stampajProfu da stampa sve podatke o profesoru
	//

	public double povecajPlatu(int procenat) {
		this.iznosPlate = this.iznosPlate * (procenat * 0.01) + this.iznosPlate;
		return this.iznosPlate;
	}
//	public void stampajProfu() {
//		this.stampaj();
//		System.out.println("Naziv predmeta: " + this.nazivPredmeta);
//		System.out.println("Iznos plate: " + this.iznosPlate);
//	}

	//override
	public void stampaj() {
		super.stampaj();
		System.out.println("Naziv predmeta: " + this.nazivPredmeta);
		System.out.println("Iznos plate: " + this.iznosPlate);
	}
	
}
