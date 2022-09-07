package p06_09_2022;

public class Zgrada extends Objekat{
//	Kreirati klasu Zgrada koja nasledjuje klasu Objekat koja ima
//broj stanova
//konstuktore, gettere i setter
//porez racuna po formuli koeficijent * povrsina * broj stanova
//prepisati metodu stampaj tako da stampa sve podatke vezane za zgradu
//	
	private int brStanova;

public Zgrada(String ulicaIBroj, int povrsina, int zona, int brStanova) {
	super(ulicaIBroj, povrsina, zona);
	this.brStanova = brStanova;
}

public int getBrStanova() {
	return brStanova;
}

public void setBrStanova(int brStanova) {
	this.brStanova = brStanova;
}
	
public double racunajPorez() {
	return this.koeficijentPoreza() * this.brStanova * this.povrsina;
}
public void stampaj() {
	System.out.println("Ulica i broj zgrade " + this.UlicaIBroj);
	System.out.println("Zona: " + this.zona);
	System.out.println("Povrsina: " + this.povrsina);
	System.out.println("Broj stanova u zgradi je: " + this.brStanova);
	System.out.println("Porez je: " + this.racunajPorez());
}
	
}
