package p26_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu Osoba koja od atributa ima:
//			 ime i prezime
//			 jmbg
//			konstuktor sa parametrima
//			metodu stampaj koja stampa podatke u formatu
//						ime prezime, jmbg
//
//					Kreirati klasu Student koja nasledjuje klasu Osoba, 
//						koja od dodatnih atributa ima:
//			broj indeksa
//			dug za skolarinu 
//			konstuktor sa parametrima
//			metodu uplati skolarinu koja umanjuje dug za prosledjenu vrednost. Metoda prima 
//			iznos uplate kao parametar metode.
//			Napisati metod stampajStudenta da stampa sve podatke o studentu
//
//
//			Kreirati klasu Profesor koja nasledjuje klasu Osoba, 
//						koja od dodatnih atributa ima:
//			naziv predmeta koji predaje
//			iznos plate
//			konstuktor sa parametrima
//			metodu povecaj platu. Metoda kao parametar prima procenat povecanja.
//			Napisati metodu stampajProfu da stampa sve podatke o profesoru
//
//						U glavnom programu kreirati 2 studenta i 2 profesora.

		Student student1 = new Student("Pera Peric", "789456123", 1000, 25000);
		Student student2 = new Student("Mira Peric", "852356123", 1001, 55000);
		
		student1.uplatiSkolarinu(10000);
		
		student1.stampaj();
		student2.stampaj();
		
		Profesor profesor1 = new Profesor("Dragan Jankovic","963963963", "Matematicka analiza 1", 85000);
		Profesor profesor2 = new Profesor("Mirjana Jankovic","986541963", "Matematicka statistika", 75000);
		profesor1.povecajPlatu(15);
		
		profesor1.stampaj();
		profesor2.stampaj();
	}

}
