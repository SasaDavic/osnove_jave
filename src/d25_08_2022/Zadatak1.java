package d25_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Napisati klasu Student koja ima
//		broj indeksa
//		ime i prezime
//		tip studija (osnovne, master, doktorske)
//		niz ispita
//		konstuktore koje mislite da ce vam trebati
//		gettere i settere za indeks, ime i prezime, tip studija
//		getter za niz predmeta
//		metodu dodaj ispit u niz ispita
//		metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//		metodu stampaj koja stampa u formatu:
//		(broj indeksa) - (ime i prezime) - (tip studija)
//		Predmeti:
//		(naziv predmeta) - (profesor) - (ocena)
//		(naziv predmeta) - (profesor) - (ocena)
//		(naziv predmeta) - (profesor) - (ocena)
//		Prosecna ocena: (prosecna ocena)
//
//
//		Napisati klasu Ispit koja ima
//		naziv predmeta
//		ocenu (u rasponu od 5 do 10)
//		Ime i prezime profesora koji predaje predmet
//		konstuktore koje mislite da ce vam trebati
//		gettere i settere za sve atribute
//		metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//		metodu koja stampa ispit u formatu:
//		(naziv predmeta) - (profesor) - (ocena)

		Student s1 = new Student(1000, "Pera Peric", "osnovne");
		
		Ispit i1 = new Ispit("Matematicka analiza 1", 5, "Dragana Cvetkovic");
		Ispit i2 = new Ispit("Matematicka analiza 4", 9, "Dragana Djordjevic");
		Ispit i3 = new Ispit("Matematicka statistika", 7, "Biljana Popovic");
		Ispit i4 = new Ispit("Uvod u diferencijalne jednacine", 7, "Jelena Manojlovic");
		Ispit i5 = new Ispit("Uvod u numericku analizu", 6, "Dragan Cvetkovic");
		
		s1.dodajIspit(i1);
		s1.dodajIspit(i2);
		s1.dodajIspit(i3);
		s1.dodajIspit(i4);
		s1.dodajIspit(i5);
		s1.stampaj();
		
		
		
		
		
		
		
		
	}

}
