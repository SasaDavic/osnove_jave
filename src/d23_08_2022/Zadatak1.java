package d23_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu ZeleniKarton koja ima:
//		ime i prezime studenta 
//		broj indeksa 
//		naziv predmeta
//		ime i prezime profesora
//		ocenu - od 5 do 10
//		gettere i settere
//		konstruktore
//		metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//		metodu stampaj koja stampa podatke u formatu:
//				(naziv predmeta) - (ocena)
//				Student: ime i prezime, broj indeksa
//				Profesor: ime i prezime
//
//				U glavnoj klasi:
//			kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//			(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//			(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita
		
		ZeleniKarton karton0 = new ZeleniKarton("Pera Peric", 1000, "Istorija", "Milutin Ivkovic", 8);
		ZeleniKarton karton1 = new ZeleniKarton("Mitar Miric", 1001, "Muzika", "Zorica Filipovic", 5);
		ZeleniKarton karton2 = new ZeleniKarton("Milan Joksimovic", 1002, "Muzika", "Zorica Filipovic", 9);
		ZeleniKarton karton3 = new ZeleniKarton("Aneta Jokic", 1003, "Istorija", "Milutin Ivkovic", 10);
		ZeleniKarton karton4 = new ZeleniKarton("Jelena Zdravkovic", 1004, "Statistika", "Biljana Popovic", 5);
		ZeleniKarton karton5 = new ZeleniKarton("Mica Mitic", 1005, "Muzika", "Zorica Filipovic", 7);
		ZeleniKarton karton6 = new ZeleniKarton("Milica Peric", 1006, "Statistika", "Biljana Popovic", 7);
		ZeleniKarton karton7 = new ZeleniKarton("Jovan Ilic", 1007, "Istorija", "Milutin Ivkovic", 8);
		ZeleniKarton karton8 = new ZeleniKarton("Milos Djokic", 1008, "Muzika", "Zorica Filipovic", 7);
		ZeleniKarton karton9 = new ZeleniKarton("Dunja Stevanovic", 1009, "Muzika", "Zorica Filipovic", 9);
		
		karton0.stampaj();
		karton1.stampaj();
		karton2.stampaj();
		karton3.stampaj();
		karton4.stampaj();
		karton5.stampaj();
		karton6.stampaj();
		karton7.stampaj();
		karton8.stampaj();
		karton9.stampaj();
		
		
		
		
		
		
		
		
		

	}

}
