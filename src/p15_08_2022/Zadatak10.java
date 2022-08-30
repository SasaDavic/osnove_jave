package p15_08_2022;

import java.util.Scanner;

public class Zadatak10 {

	public static void main(String[] args) {
	
//		Napisati funkciju koja vrsi konverziju eura u dinare, 
//		rublje ili dolare prema dole navedenoj konverziji. 
//		Metoda od parametara prima vrednost u eurima kao i valutu u 
//		kojoj je potrebno izvrsiti konverziju (RSD/USD/RUB) a vraca konvertovanu vrednost. 
//		U glavnom programu pozvati funkciju za neki od primera.
//		Primer poziva funkcija:
//		Ako se za vrednost u eurima unese 3 i valuta RSD vraca vrednost 351.6339
//		Ako se za vrednost u eurima unese 4.5 i valuta USD vraca vrednost 5.31945
//		Primer izvrsenja main programa:
//		Unesite vrednost u eurima: 3
//		Unesite valutu za konverziju: RSD
//		3 EUR je 351.6339 RSD
//		Konverzija eura u druge valute:
//		1 EUR = 117.5 RSD
//		1 EUR = 1.1 USD
//		1 EUR = 62.98 RUB
		
		Scanner s = new Scanner(System.in);
		System.out.print("Unesite vrednost u eurima koju zelite da konvertujete: ");
		int eur = s.nextInt();
		System.out.print("Unesite valutu za konverziju(RSD/USD/RUB): ");
		String valuta = s.next();
		double vrednost = konverzija(eur, valuta);
		System.out.println(eur + " EUR je " + vrednost + " " + valuta);
		
	}
	public static double konverzija(int eur, String valuta) {
		if (valuta.equals("RSD")) {
			return eur * 117.5;
		} else if (valuta.equals("USD")) {
			return eur * 1.1;
		} else if (valuta.equals("RUB")) {
			return eur * 62.98;
		}
		return eur;
	}
	
}
