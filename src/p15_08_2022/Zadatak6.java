package p15_08_2022;

public class Zadatak6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6. Zadatak
//		Napisati metodu koja stampa N zvezdica u istom redu. Broj zvezdica je odredjen parametrom N.
//		Ako se metoda pozove za N=5, metoda stampa 5 zvezdica i enter
//		N=5, print je=> * * * * * 
//
//		Ako se metoda pozove za N = 9, metoda stampa 9 zvezdica i enter
//		N=9, print je=> * * * * * * * * * 

		
		printZvezda(5);
		printPiramida(5);
		
		
	}
	public static void printZvezda(int brZvezda) {
		for (int i = 0; i < brZvezda; i++) {
			System.out.print("* ");
		} System.out.println();
	}
	
	public static void printPiramida(int brZvezda) {
		
		for (int j = 1; j <= brZvezda; j++) {
			for (int i = 0; i < j; i++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
