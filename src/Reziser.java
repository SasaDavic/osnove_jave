
public class Reziser {
//	reziser
//	konstruktore, gettere i settere koji su potrebni
//	metodu print koja stampa podatke u formatu
//	naziv filma, godina
//	Rezirao je: Ime prezime, starost.god
	
	private String punoIme;
	private int starost;
	
	
	public Reziser(String punoIme, int starost) {
		this.punoIme = punoIme;
		this.starost = starost;
	}
	
	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}
	public String getPunoIme() {
		return this.punoIme;
	}
	public void setStarost(int starost) {
		this.starost = starost;
	}
	public int getStarost() {
		return this.starost;
	}
	
	
	
	
	
}
