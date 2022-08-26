package d25_08_2022;

import java.util.ArrayList;

public class Student {
//	Napisati klasu Student koja ima
//	broj indeksa
//	ime i prezime
//	tip studija (osnovne, master, doktorske)
//	niz ispita
//	konstuktore koje mislite da ce vam trebati
//	gettere i settere za indeks, ime i prezime, tip studija
//	getter za niz predmeta

	
	private int brIndexa;
	private String imeStudenta;
	private String tipStudija;
	private ArrayList<Ispit> ispiti = new ArrayList<Ispit>();
	
	
	
	public Student(int brIndexa, String imeStudenta, String tipStudija) {
		
		this.brIndexa = brIndexa;
		this.imeStudenta = imeStudenta;
		this.tipStudija = tipStudija;
		
	}
	public ArrayList<Ispit> getIspiti() {
		return ispiti;
	}
	public int getBrIndexa() {
		return brIndexa;
	}
	public void setBrIndexa(int brIndexa) {
		this.brIndexa = brIndexa;
	}
	public String getImeStudenta() {
		return imeStudenta;
	}
	public void setImeStudenta(String imeStudenta) {
		this.imeStudenta = imeStudenta;
	}
	public String getTipStudija() {
		return tipStudija;
	}
	public void setTipStudija(String tipStudija) {
		this.tipStudija = tipStudija;
	}
	
//	metodu dodaj ispit u niz ispita
//	metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)

	
	public void dodajIspit(Ispit ispit) {
		this.ispiti.add(ispit);
	}
	
	public double racunajProsek() {
		int brojac = 0;
		int suma = 0;
		for (int i = 0; i < this.ispiti.size(); i++) { //if (this.ispiti.get(i).getOcena() > 5)
			if (this.ispiti.get(i).polozio() == true) {
				suma = suma + this.ispiti.get(i).getOcena();
				brojac++;
			}
		}
		return suma * 1.000 / brojac;
	}
	
//	metodu stampaj koja stampa u formatu:
//	(broj indeksa) - (ime i prezime) - (tip studija)
//	Predmeti:
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	Prosecna ocena: (prosecna ocena)
	
	public void stampaj() {
		System.out.println(this.brIndexa + " - " + this.imeStudenta + " - " + this.tipStudija);
		System.out.println("Predmeti: ");
		for (int i = 0; i < this.ispiti.size(); i++) {
			this.ispiti.get(i).stampaj();
			this.racunajProsek();

		}
		System.out.println("Prosecna ocena je: " + this.racunajProsek());
	}
	
	
	
	
	
	
	
}
