package p25_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu Sastojak koja ima:
//			naziv
//			cenu
//			gettere i settere
//			konstruktore
//			metodu za stampanje koja stampa  podatke u formatu:
//			naziv - cena.din
//				
//				Kreirati klasu Pasta koja ima:
//			niz sastojaka
//			metodu za dodavanje sastojka
//			defaultni konstruktor
//			metodu koja racuna cenu paste, tako sto sumira cene svih sastojaka
//			metodu za stampu koja stampa podatke u formatu:
//			Pasta je sa sastojcima:
//			naziv - cena.din
//			naziv - cena.din
//			naziv - cena.din
//			Cena paste je cena.din
//
//			U glavnom programu kreirati objekte i testirati funkcionalnosti 
//
//			(ostavite za kraj) metodu za brisanje sastojka. U metodu se salje naziv sastojka koji se brise.

			Pasta p = new Pasta();
			
			Sastojak s1 = new Sastojak("Kackavalj", 300);
			Sastojak s2 = new Sastojak("Pene", 50);
			Sastojak s3 = new Sastojak("Paradajz", 30);
			
			p.dodaj(s1);
			p.dodaj(s2);
			p.dodaj(s3);
			
			p.cenaPaste();
			p.stampaj();
			
			p.brisi("Pene");
			p.stampaj();
			
			
					
		
		
		
		
		
	}

}
