package d22_08_2022;

public class Vaga {
//	Kreirati klasu Vaga koja ima:
//		merna jedinica (kg ili lb)
//		proizvod (proizvod koji se meri)
//		TEZINA SE NE CUVA KAO ATRIBUT!!!!!!!!!
//		default-ni konstuktor
//		getteri i setteri za sve atribute

	
	private String mernaJedinica;
	private Proizvod proizvod;
	private double tezina;
	
	public Vaga() {
	}

	public String getMernaJedinica() {
		return mernaJedinica;
	}

	public void setMernaJedinica(String mernaJedinica) {
		this.mernaJedinica = mernaJedinica;
	}
	
	
	
//	metodu sracunajCenu koja vraca cenu proizvoda za unetu tezinu (tezina je parametar funkcije). 
//	Na racunanje cene utice i merna jedinica na koju je vaga podesena. 
//	metodu stampaj koja stampa racun u formatu. POMOC: trebace vam tezina kao parametar u ovoj metodi
//	               (sifra) - (naziv)
//	   (cena za odgovarajucu mernu jedinicu) (merna jedinica) x (tezina) 
//	   Ukupno: (ukupna cena) 	
	
	
	
	public double getTezina() {
		return tezina;
	}

	public void setTezina(double tezina) {
		this.tezina = tezina;
	}

	public double sracunajCenu(double tezina) {
		if (this.mernaJedinica.equals("kg")) {
			return this.tezina * this.proizvod.getCenaKg();
		} else if (this.mernaJedinica.equals("lb")) {
			return this.tezina * this.proizvod.getCenaLb();
		}
		return this.tezina;
	}
	
	
	public Proizvod getProizvod() {
		return proizvod;
	}

	public void stampaj() {
		System.out.println(this.proizvod.getSifra() + " " + this.proizvod.getNaziv());
		if (this.mernaJedinica.equals("kg")) {
			System.out.println(this.proizvod.getCenaKg() + " kg x " + this.tezina);
		} else if (this.mernaJedinica.equals("lb")) {
			System.out.println(this.proizvod.getCenaLb() + " lb x " + this.tezina);
		}
		System.out.println("Ukupno: " + this.sracunajCenu(this.tezina));
	}


	
	
	
	
	
}
