package d26_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu Osoba koja ima:
//			ime i prezime
//			jmbg
//			godinu rodjenja
//			default-ni konstuktor
//			konstuktor sa parametrima
//			gettere i settere 
//			metodu stampaj koja stampa u formatu:
//			(ime i prezime), (jmbg), (godina rodjenja)
//
//			Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//			broj (broj koji igrac nosi)
//			poziciju koju igra (odbrambeni, napadac, … )
//			kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//			default-ni konstuktor
//			konstuktor sa parametrima
//			gettere i settere za broj, kapiten i poziciju
//			metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//			Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//			godine iskustva
//			tip trenera (kondicioni, za igru, pomocni, personalni)
//			metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//
//			U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.
		
		Igrac igrac1 = new Igrac("Pera Peric", "123456789", 2000, 29, "napadac", true);
		Igrac igrac2 = new Igrac("Mitar Peric", "789456789", 2002, 35, "odbrambeni", false);
		
		igrac1.stampaj();
		igrac2.stampaj();

		Trener trener1 = new Trener("Dragan Dragic", "741258963", 1970, 20, "kondicioni");
		Trener trener2 = new Trener("Bosko Dragic", "201258963", 1980, 15, "personalni");
		
		trener1.stampaj();
		trener2.stampaj();
		
		
		
	}

}
