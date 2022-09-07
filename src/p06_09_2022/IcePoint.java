package p06_09_2022;

public class IcePoint extends Proizvod{
//	Kreirati klasu IcePoint koja nasledjuje klasu Proizvod i koja ima:
//	 tip sladoleda (vanila, cokolada)
//	 atribut koji kaze da li je mali ice point ili veliki (promenljiva tipa boolean)
//	 override uje metodu koja ukupnu cenu racuna:
//	ako je mali ice point na cenu svih dodataka doda 100
//	ako je veliki ice point cenu svih dodataka doda 130
//	override uje metodu stampaj da stampa sve podatke
	
	private String tip;
	private boolean m_v; // m-false, v-true
	
	public double ukupnuRacunajCenu() {
		if (m_v == false) {
			return this.cenaDodataka() + 100;
		} else {
			return this.cenaDodataka() + 130;
		}
	}
	
	public void stampaj() {
		System.out.println("Sladoled je " + this.tip);
		System.out.println("Veliki ice point " + this.m_v);
		System.out.println("Ukupna cena sladoleda je " + this.ukupnuRacunajCenu());
	}
	
	
	
	
}
