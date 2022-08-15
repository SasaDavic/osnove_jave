package p15_08_2022;

public class Zadatak3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3.Napisati dve metode:
//			- Prva metoda koja stampa zvezdicu sa razmakom. 
//		- Druga metoda koja stampa samo novi red.
//		U glavnom programu je potrebno odstampati sledecu sliku koristeci metode koje smo definisali.
//		*  *  * 
//		*  *  
//		*  
		
		printZvezda();
		printRazmak();
		printZvezda();
		printRazmak();
		printZvezda();
		printRazmak();
		System.out.println();
		printZvezda();
		printRazmak();
		printZvezda();
		printRazmak();
		System.out.println();
		printZvezda();
		
		
	}
	public static void printZvezda() {
		System.out.print("*");
	}
	public static void printRazmak() {
		System.out.print(" ");
	}
}
