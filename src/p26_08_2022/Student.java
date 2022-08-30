package p26_08_2022;

public class Student extends Osoba {

//	Kreirati klasu Student koja nasledjuje klasu Osoba, 
//	koja od dodatnih atributa ima:
//broj indeksa
//dug za skolarinu 
//konstuktor sa parametrima

	private int brIndexa;
	private int dugSkolarina;
	
	public Student(String imeIPrezime, String jmbg, int brIndexa, int dugSkolarina) {
		super(imeIPrezime, jmbg);
		this.brIndexa = brIndexa;
		this.dugSkolarina = dugSkolarina;
	}
	
	//metodu uplati skolarinu koja umanjuje dug za prosledjenu vrednost. Metoda prima 
	//iznos uplate kao parametar metode.
	//Napisati metod stampajStudenta da stampa sve podatke o studentu
		
	public int uplatiSkolarinu(int uplata) {
		this.dugSkolarina = this.dugSkolarina - uplata;
		return this.dugSkolarina;
	}
	
//	public void stampajStudenta() {
//		this.stampaj();
//		System.out.println("Broj idexa: " + this.brIndexa);
//		System.out.println("Dug za skolarinu: " + this.dugSkolarina);
//		
//	}
	
	///override
	public void stampaj() {
		super.stampaj();
		System.out.println("Broj idexa: " + this.brIndexa);
		System.out.println("Dug za skolarinu: " + this.dugSkolarina);
		
	}
	
	
	
	
}
