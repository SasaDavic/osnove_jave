package p15_08_2022;

public class Zadatak7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Napisati metodu koja vraca suprotno negativni broj od prosledjenog. 
//		Metoda prima broj N i vraca ga sa negativnom vrednoscu.
//		Primer: Ako se metoda pozove za N=10, vraca -10
//			Ako se metoda pozove za N=-11, vraca 11

		int z = suprotno(9);
		System.out.println("Suprotna vrednost je " + z);
		
		
	}
	public static int suprotno(int a) {
		int b = -1 * a;
		return b;
	}
	
	

}
