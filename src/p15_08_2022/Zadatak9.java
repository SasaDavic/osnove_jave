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
		
		int a = arapski("III");
		System.out.println("Arapski zapis broja je " + a);
		
		int b = arapski("r");
		System.out.println("Arapski zapis broja je " + b);
		
		
	}
	public static int arapski(String rimski) {
		if (rimski.equals("I")) {
			return 1;
		} else if (rimski.equals("II")) {
			return 2;
		} else if (rimski.equals("III")) {
			return 3;
		} else if (rimski.equals("IV")) {
			return 4;
		} else if (rimski.equals("V")) {
			return 5;
		}
		return 0;
	}

}
