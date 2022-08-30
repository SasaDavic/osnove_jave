package d18_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
//		Kreirati klasu FacebookPost koja ima:
//			   Od atributa:
//			ime i prezime korisnika koji je objavio post
//			ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da
//			postavite objavu na tudjem profilu)
//			tekst objave
//			broj lajkova
//			broj deljenja
//			  Od metoda:
//			like(), koja povecava broj lajkova za 1.
//			dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//			share(), koja povecava broj deljenja za 1
//			print(), koja stampa objavu u formatu:
//			(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//			(tekst objave)
//			Likes (broj lajkova) | Shares (broj deljenja)
//
//			U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//
//
//			Primer stampanja:
//			Milan Jovanovic >>> Pera Peric
//			Ovo je tekst objave
//			Likes 3 | Shares 1
		
		FacebookPost prvi = new FacebookPost();
		prvi.korisnikObjava = "Mika Antic";
		prvi.korisnikProfil = "Pera Peric";
		prvi.textObjave = "Ovo je tekst objave";
		prvi.brLajkova = 3;
		prvi.brDeljenja = 1;
		
		prvi.print();
		
		prvi.dislike();
		prvi.like();
		prvi.share();
		prvi.print();
		
		FacebookPost drugi = new FacebookPost();
		drugi.korisnikObjava = "Mitar Miric";
		drugi.korisnikProfil = "Zorica";
		drugi.textObjave = "lalalalala";
		drugi.brLajkova = 1000;
		drugi.brDeljenja = 15;
		
		drugi.print();
		
		drugi.like();
		drugi.like();
		drugi.like();
		drugi.dislike();
		drugi.share();
		
		drugi.print();
		
		

	}

}
