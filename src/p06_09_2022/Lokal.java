package p06_09_2022;

public class Lokal extends Objekat{


	//	Kreirati klasu Lokal koja naslejduje klasu Objekat koja od metoda ima:
//		konstuktore
//		porez racuna po formuli koeficijent * povrsina * 1.3
//		prepisati metodu stampaj tako da stampa sve podatke vezane za lokal
	
	
	
	public double racunajPorez() {
		return this.povrsina * 1.3 * this.koeficijentPoreza();
	}
	public Lokal(String ulicaIBroj, int povrsina, int zona) {
		super(ulicaIBroj, povrsina, zona);
	}
	public void stampaj() {
		System.out.println("Ulica i broj lokala " + this.UlicaIBroj);
		System.out.println("Zona: " + this.zona);
		System.out.println("Povrsina: " + this.povrsina);
		System.out.println("Porez iznosi: " + this.racunajPorez());
	}
	
	
	
	
	
}
