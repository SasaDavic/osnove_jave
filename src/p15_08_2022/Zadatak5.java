package p15_08_2022;

public class Zadatak5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		5. Zadatak
//		Napisati metodu stampajApsolutnuVrednost, koja stampa apsolutnu vrednost  
//		prosledjene vrednosti.
		
		printApsolutno(-9);

	}
	public static void printApsolutno(int a) {
		int b = a;
		if (a < 0) {
		b = b * (-1);
	}
	System.out.println("Apsolutna vrednost je " + b);
	
}}
