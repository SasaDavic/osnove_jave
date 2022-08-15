package p15_08_2022;

public class Zadatak9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Napisati metodu koja vrsi konverziju rimske(string) u arapske brojeve(int). 
//		1 - I
//		2 - II
//		3 - III
//		4 - IV
//		5 - V
//
//		Kao parametar se unosi vrednost rimkog broja(string) a vraca se arapski (int).
//		Ako se unese V vraca se 5.
		
		int arapski = konverzija("V");
		System.out.println("Arapski zapis broja je " + arapski);
		
		
	}
	public static int konverzija(String rimski) {
		int arapski = 0;
		if (rimski.equals("I")) {
			arapski = 1;
		} else if (rimski.equals("II")) {
			arapski = 2;
		} else if (rimski.equals("III")) {
			arapski = 3;
		} else if (rimski.equals("IV")) {
			arapski = 4;
		} else if (rimski.equals("V")) {
			arapski = 5;
		}
		return arapski;
	}

}
