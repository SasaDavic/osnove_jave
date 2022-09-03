package p22_08_2022;

public class Reziser {
//	Kreirati klasu Reziser koja ima:
//	ime i prezime rezisera
//	starost
//	konstruktore, gettere i settere koji su potrebni
//	metodu print koja stampa podatke u formatu
//	ime prezime, starost.god
	
	private String ime;
	private int starost;
	
	public Reziser() { //difoltni konstruktor		
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public int getStarost() {
		return starost;
	}

	public void setStarost(int starost) {
		this.starost = starost;
	}

//	metodu print koja stampa podatke u formatu
//	ime prezime, starost.god
	
	public void print() {
		System.out.println(this.ime + ", " + this.starost + " god.");
	}
	
	
	
	
}
