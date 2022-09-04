package mini_projekat;

public class Player {
//	ime i prezime
//	gettere i settere
//	konstuktore
//	metodu print, koja stampa ime i prezime igraca
	
	private String imeIgraca;

	public Player(String imeIgraca) {
	
		this.imeIgraca = imeIgraca;
	}

	public String getImeIgraca() {
		return imeIgraca;
	}

	public void setImeIgraca(String imeIgraca) {
		this.imeIgraca = imeIgraca;
	}
	
	public void print() {
		System.out.println("Ime igraga: " + this.imeIgraca);
	}
	
	
	
	
}
