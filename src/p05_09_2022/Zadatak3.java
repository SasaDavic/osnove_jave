package p05_09_2022;

import java.util.ArrayList;
import java.util.Random;

public class Zadatak3 {

	public static void main(String[] args) {
//		 Zadatak
//		 Kreirati abstraktnu klasu Figura koja ima
//		 abstraktnu metodu povrsina
//		 abstraktnu metodu obim
//		 metodu koja stampa podatke u formatu:
//		 Povrsina je (povrsina)
//		 Obim je (obim)
//
//		 Kreirati klasu JednakostranicniTrougao koja nasledjuje klasu Figura:
//		 stranicu a
//		 gettere/settere/konstruktore
//		 implementira metodu povrsina po formuli (a * a) * 1.73205 / 4
//		 implementira metodu obim
//
//		 Kreirati klasu Pravougaonik koja nasledjuje klasu Figura:
//		 stranice a i b
//		 gettere/settere/konstruktore
//		 implementira metodu povrsina
//		 implementira metodu obim
//
//		 U glavnoj klasi kreirati niz od 5 figura (2 trougla, 3 pravougaonika) zatim sabrati sve povrsine i 
//		 obime i za svaku figuru ispisati ponaosob


		Figura t1 = new JednakostranicniTrougao(2);
		Figura t2 = new JednakostranicniTrougao(3);
		
		Figura p1 = new Pravougaonik(2, 3);
		Figura p2 = new Pravougaonik(3, 4);
		Figura p3 = new Pravougaonik(4, 6);
		
		ArrayList<Integer> niz = new ArrayList<Integer>();
	
		

		
		
		t1.stampaj();
		t2.stampaj();
		
		p1.stampaj();
		p2.stampaj();
		p3.stampaj();
		
		
		
	}



}
