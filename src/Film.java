
public class Film {
//	Kreirati klasu Film koja ima:
//		naziv filma
//		iz koje godine je film 
//		
	
	private String naziv;
	private int godina;
	private Reziser reziser;
	
	public Film(String naziv, int godina, Reziser reziser) {
		this.naziv = naziv;
		this.godina = godina;
		this.reziser = reziser;
	}
	
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getNaziv() {
		return this.naziv;
	}
	public void setGodina(int godina) {
		this.godina = godina;
	}
	public String getGodina() {
		return this.naziv;
	}
	public void print() {
		System.out.println("Naziv filma: " + this.naziv + ", " + this.godina);
		System.out.println("Rezirao je: " + this.reziser.getPunoIme() + ", " + this.reziser.getStarost());
	}
	
}
