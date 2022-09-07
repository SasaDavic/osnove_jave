package p06_09_2022;

public class Kuca extends Objekat{
//	Kreirati klasu Kuca koja nasledjuje klasu Objekat koja ima broj clanova koji zive u tom objektu, 
//konstuktore, gettere i setter
//porez racuna po formuli: koeficijent * povrsina.
//prepisati metodu stampaj tako da stampa sve podatke vezane za kucu
	
	private int brClanova;

public Kuca(String ulicaIBroj, int povrsina, int zona, int brClanova) {
		super(ulicaIBroj, povrsina, zona);
		this.brClanova = brClanova;
	}

public int getBrClanova() {
	return brClanova;
}

public void setBrClanova(int brClanova) {
	this.brClanova = brClanova;
}
public double racunajPorez() {
	return this.povrsina * this.koeficijentPoreza();
}
public void stampaj() {
	System.out.println("Ulica i broj kuce " + this.UlicaIBroj);
	System.out.println("Zona: " + this.zona);
	System.out.println("Povrsina: " + this.povrsina);
	System.out.println("Porez iznosi: " + this.racunajPorez());
}

	
	
	
	
}
