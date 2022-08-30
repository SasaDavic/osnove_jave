package p15_08_2022;

public class Zadatak8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Napisati metodu koja proverava da li je trougao pravougli. Metoda prima stranice 
//		trougla i hipotenuzu trougla. Ako je trougao pravougli onda vraca true, 
//		u suptrotnom vraca false.
//		Trougao je pravougli ukoliko je a*a+b*b=c*c
		
		boolean prav = pravougli(2, 3, 4);
		if (prav == true) {
			System.out.println("Trougao je pravougli");
		} else {
			System.out.println("Nije pravougli");
		}
		
		boolean prav1 = pravougli(3, 4, 5);
		if (prav1 == true) {
			System.out.println("Trougao je pravougli");
		} else {
			System.out.println("Nije pravougli");
		}
		
		
	}
//	public static boolean pravougli(int a, int b, int c) {
//		if (a*a + b*b == c*c) {
//			return true;
//		} else {
//			return false;
//		}
//	}
	
		//LEPSI NACIN
	
	public static boolean pravougli(int a, int b, int c) {
		return (a*a + b*b == c*c) ? true : false;
	}
	
}
