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
		
		for (int j = 0; j < 3; j++) {
			for (int i = 3 - j; i > 0; i--) {
				stampajZvezdu();
			}
			stampajLn();
		}
			
	}
	public static void stampajZvezdu() {
		System.out.print("* ");
	}
	public static void stampajLn() {
		System.out.println();
	}
}
