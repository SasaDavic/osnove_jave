package d15_08_2022;

public class Zadatak6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		(Za vezbanje )Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
//
//		Primer izvrsenja: 
//		izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//		izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1
		

//		Napomena: Resiti bez koriscenja petlji.

		
		int broj = brojac(10, 4);
		System.out.println("Rezultat je " + broj);
		
	}
	public static int brojac(int x, int y) {
		if (x <= y) {
			return y - x - 1;
		} else {
			return x - y - 1;
		}
		
	}
}
