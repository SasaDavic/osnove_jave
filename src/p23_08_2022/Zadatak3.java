package p23_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
//		Kreirati klasu Sastojak koja ima:
//			naziv sastojka
//			cenu 
//			gettere i settere 
//			konstuktore
//
//
//			--U glavnom programu kreirati 3 sastojka.
//			 U glavnom programu kreirati niz sastojaka ucitavajuci ih od korisnika. Ucitavaju se N 
//			 sastojaka i na kraju odstampati niz. Koristeci ArrayList-e
		
		
		Sastojak prvi = new Sastojak("So", 123.54);
		Sastojak drugi = new Sastojak("Secer", 150);
		Sastojak treci = new Sastojak("Brasno", 80);
		
		ArrayList<Sastojak> niz = new ArrayList<Sastojak>();
		niz.add(prvi);
		niz.add(drugi);
		niz.add(treci);
		Scanner s = new Scanner(System.in);
		System.out.print("Koliko sastojaka zelite da unesete? ");
		int n = s.nextInt();
		for (int i = 3; i < n + 3; i++) {
			System.out.println("Unesite ime sastojka: ");
			String ime = s.next();
			System.out.println("Unesite cenu ");
			double cena = s.nextDouble();
			Sastojak sastojak = new Sastojak(ime, cena);
			niz.add(sastojak);
		}
		
		for (int i = 0; i < niz.size(); i++) {
			System.out.println("Sastojak br " + i);
			System.out.println("Naziv " + niz.get(i).getNaziv() + ", cena: " + niz.get(i).getCena());
			System.out.println("------------------------------------------------------------------");
			
		}
		
		
		
		

	}

}
