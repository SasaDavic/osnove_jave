package p15_08_2022;

public class Zadatak5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		5. Zadatak
//		Napisati metodu stampajApsolutnuVrednost, koja stampa apsolutnu vrednost  
//		prosledjene vrednosti.
		
		stampajApsolutno(-1);
		stampajApsolutno(10);
		stampajApsolutno(-5);

	}
	public static void stampajApsolutno(int a) {
		if (a < 0) {
			System.out.println("Apsolutna vrednost je " + (-a));
		} else {
			System.out.println("Apsolutna vrednost je " + a);
		}
	}

}
