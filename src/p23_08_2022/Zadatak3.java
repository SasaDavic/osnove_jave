package p23_08_2022;

import java.util.ArrayList;
import java.util.Scanner;


public class Zadatak3 {

	public static void main(String[] args) {
//
//			--U glavnom programu kreirati 3 sastojka.
//			 U glavnom programu kreirati niz sastojaka ucitavajuci ih od korisnika. 
//			 Ucitavaju se N sastojaka i na kraju odstampati niz. Koristeci ArrayList-e
		
		Scanner s = new Scanner(System.in);
		ArrayList<Sastojak> sastojci = new ArrayList<Sastojak>();
		
		Sastojak sastojak0 = new Sastojak("so458798", 150);
		Sastojak sastojak1 = new Sastojak("478546321", 852);
		Sastojak sastojak2 = new Sastojak("785463218", 458);
		
		System.out.println("Unesi N: ");
		int n = s.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Unesi ime sastojka: ");
			String ime = s.next();
			System.out.println("Cena:");
			int cena = s.nextInt();
			Sastojak i1 = new Sastojak(ime , cena);
			sastojci.add(i1);
		}

	}

	

}
