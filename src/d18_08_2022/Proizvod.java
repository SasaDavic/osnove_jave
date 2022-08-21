package d18_08_2022;

public class Proizvod {
	public String ime;
	public double cena;
	public double tezina;
	public double cenaSaPopustom;
	public int postarina = 0;
	

	public void stampaj() {
		System.out.println("Naziv proizvoda: " + this.ime + ", " + this.cena + "din, " + this.tezina + "g");
	}
//	povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu. 
////	Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.

		public void povecajCenu(double poskupljenje) {
			this.cena = this.cena + poskupljenje;
		}
		
//		vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, a povratnu vrednost je 
//		cena proizvoda kada se uračuna popust.Ova funkcije ne menja atribut cena. Smatrati da je parametar 
//		popust u opsegu od 0 do 100.
		
		public void vratiCenuSaPopustom(int popust) {
			this.cenaSaPopustom = this.cena - (this.cena * popust * 0.01);
		}
		
//		racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe.
//		Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:	
//			za tezinu do 100g, postarina iznosi 200din
//			za tezinu od 101g do 500g, postarina iznosi 400din
//			za tezinu preko 500g, postarina iznosi 1000din
		
		public void racunajPostarinu() {
			
			if (this.tezina < 101) {
				this.postarina = 200;
			} else if (this.tezina < 501) {
				this.postarina = 400;
			} else {
				this.postarina = 1000;
			}
		}
		
		
}
