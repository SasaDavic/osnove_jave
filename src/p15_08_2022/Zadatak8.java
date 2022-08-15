package p15_08_2022;

public class Zadatak8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Napisati metodu koja proverava da li je trougao pravougli. Metoda prima stranice 
//		trougla i hipotenuzu trougla. Ako je trougao pravougli onda vraca true, 
//		u suptrotnom vraca false.
//		Trougao je pravougli ukoliko je a*a+b*b=c*c
		
		boolean pravougli = pitagora(3, 4, 8);
		System.out.println("Trougao je pravougli: " + pravougli);
		
	}
	public static boolean pitagora(int a, int b, int c) {
		boolean z;
		if (a*a + b*b == c*c) {
			z = true;
		} else {
			z = false;
		}
		
		return z;
	}
}
