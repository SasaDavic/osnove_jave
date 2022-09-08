package d06_09_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Kreirati abstraktnu klasu Ambalaza koja ima:
//			barkod (primer: 328232-2823)
//			naziv artikla
//			neto tezinu
//			bruto tezinu
//			konstuktore (default-ni i sa parametrima)
//			gettere i settere
//			metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
//			abstraktnu metodu koja vraca cenu artikla
//			abstraktnu metodu stampaj
//
//			Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//			atribut koji kaze da li se moze reciklirati
//			osnovna cena
//			gettere i setter za atribute
//			konstuktori koji su vam potrebni
//			racuna cenu tako da ispunjava uslova:
//			ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//			ako nije u cenu ulazi samo osnovna cena
//			metoda stampaj stampa sve podatke iz klase tetrapak.
//
//			Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//			kaucija za flasu
//			atribut koji kaze da li se za flasu placa kaucija
//			osnovna cena
//			gettere i setter za atribute
//			konstuktori koji su vam potrebni
//			racuna cenu
//			ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//			ako se ne placa, (osnovna cena) * 1.2
//			metoda stampaj stampa sve podatke iz klase staklena flasa.
//
//			Kreirati klasu SuperKartica koja ima:
//			broj kartice
//			ime i prezime vlasnika
//			popust (200, 500, … )
//			konstuktore (default-ni i sa parametrima)
//			gettere i settere 
//			metodu stampaj koja stampa karticu u formatu:
//			(broj kartice), (ime i prezime)
//
//			Kreirati klasu Korpa koja ima:
//			niz ambalaza
//			metodu dodaj ambalazu
//			metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//			privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust. 
//			metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije se 
//			prima Super karticu iz koje se cita popust.
//
//			U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih tipova i istestirati 
//			sve metode i ispisati ukupnu cenu sa popustom.

		
		Tetrapak t1 = new Tetrapak("789 456321 123", "Slag krem", 180, 200);
		t1.setOsnovnaCena(436);
		t1.setReciklaza(true);
		t1.stampaj();
		System.out.println();
		Tetrapak t2 = new Tetrapak("741 852963 123", "Joya Soja Drink", 250, 230);
		t2.setOsnovnaCena(540);
		t2.setReciklaza(false);
		t2.stampaj();
		System.out.println();

		StaklenaAmbalaza s1 = new StaklenaAmbalaza("963 123456 789", "Belo vino", 750, 800);
		s1.setDaLiPlacateKauciju(true);
		s1.setKaucijaFlasa(50);
		s1.setOsnovnaCena(800);
		s1.stampaj();
		System.out.println();
		
		SuperKartica s = new SuperKartica("0125", "Sara", 500);
		s.stampaj();
		
		Korpa korpa = new Korpa();
		korpa.dodajAmbalazu(s1);
		korpa.dodajAmbalazu(t1);
		korpa.dodajAmbalazu(t2);
		
		korpa.ukupnaCenuKorpe(s);
		
		korpa.izbaciAmbalazu("963 123456 789");
		korpa.ukupnaCenuKorpe(s);
		
		korpa.izbaciAmbalazu("741 852963 123");
		korpa.ukupnaCenuKorpe(s);
		
		
		
	}

}
