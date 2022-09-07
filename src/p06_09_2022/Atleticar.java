package p06_09_2022;

public abstract class Atleticar {
//	Kreirati apstraktnu klasu Atleticar čiji su tributi: 
//	ime i prezime privatni
//	i rezultat ostvaren na takmičenju koji je zasticen
//	Javne metode klase su: 
//	apstratktna metoda koja ispituje da li je rezultat atletičara bolji od rezultata drugog atletičara 
//	(metoda za parametar prima atleticara, ne rezultat drugog atleticara!!)
//	metoda koja stampa podataka o atletičaru u formatu: (ime) (prezime), (rezultat) 
	
	private String ImeIPrezime;
	protected double rezultat;
	
	
	
	public Atleticar(String imeIPrezime, double rezultat) {
		
		this.ImeIPrezime = imeIPrezime;
		this.rezultat = rezultat;
	}

	public abstract boolean boljiRezultat(Atleticar atleticar);
	
	public void stampaj() {
		System.out.println(this.ImeIPrezime + ", " + this.rezultat);
	}

	public String getImeIPrezime() {
		return ImeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		ImeIPrezime = imeIPrezime;
	}
	
	
	
	
	
}
