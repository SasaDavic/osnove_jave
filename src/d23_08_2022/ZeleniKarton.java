package d23_08_2022;

public class ZeleniKarton {
	
//	Kreirati klasu ZeleniKarton koja ima:
//	ime i prezime studenta 
//	broj indeksa 
//	naziv predmeta
//	ime i prezime profesora
//	ocenu - od 5 do 10
//	gettere i settere
//	konstruktore

	
	private String imeStudenta;
	private int brIndexa;
	private String nazivPredmeta;
	private String imeProfesora;
	private int ocena;
		
	
	public ZeleniKarton(String imeStudenta, int brIndexa, String nazivPredmeta, String imeProfesora, int ocena) {
		this.imeStudenta = imeStudenta;
		this.brIndexa = brIndexa;
		this.nazivPredmeta = nazivPredmeta;
		this.imeProfesora = imeProfesora;
		this.ocena = ocena;
	}
	
	
	public String getImeStudenta() {
		return imeStudenta;
	}
	public void setImeStudenta(String imeStudenta) {
		this.imeStudenta = imeStudenta;
	}
	public int getBrIndexa() {
		return brIndexa;
	}
	public void setBrIndexa(int brIndexa) {
		this.brIndexa = brIndexa;
	}
	public String getNazivPredmeta() {
		return nazivPredmeta;
	}
	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}
	public String getImeProfesora() {
		return imeProfesora;
	}
	public void setImeProfesora(String imeProfesora) {
		this.imeProfesora = imeProfesora;
	}
	public int getOcena() {
		return ocena;
	}
	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	
//	metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//	metodu stampaj koja stampa podatke u formatu:
//			(naziv predmeta) - (ocena)
//			Student: ime i prezime, broj indeksa
//			Profesor: ime i prezime
	
	public boolean polozenIspit() {
		if (this.ocena > 5) {
			return true;
		} else {
			return false;
		}
	}
	public void stampaj() {
		System.out.println(this.nazivPredmeta + " - " + this.ocena);
		System.out.println(this.imeStudenta + ", " + this.brIndexa);
		System.out.println("Profesor: " + this.imeProfesora);
	}
	
	
	
}
